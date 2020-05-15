package com.soft1851.springboot.schedule.controller;

import com.soft1851.springboot.schedule.model.Cron;
import com.soft1851.springboot.schedule.repository.CronRepository;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.jni.Local;
import org.springframework.context.annotation.Bean;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.time.LocalDateTime;
import java.util.concurrent.ScheduledFuture;

/**
 * @author xunmi
 * @ClassName MyTaskController
 * @Description TODO
 * @Date 2020/5/16
 * @Version 1.0
 **/
@RestController
@RequestMapping(value = "/cron")
@Slf4j
public class MyTaskController {

    @Resource
    protected CronRepository cronRepository;

    /**
     * 线程池任务调度类，能够开启线程池进行任务调度
     */
    @Resource
    private ThreadPoolTaskScheduler threadPoolTaskScheduler;

    @Bean
    public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
        return new ThreadPoolTaskScheduler();
    }

    /**
     * ThreadPoolTaskScheduler.schedule() 方法会创建一个定时计划 ScheduledFuture,
     * 在这个方法需要添加两个参数，Runnable（线程接口）和 CronTrigger（定时任务触发器）
     */
    ScheduledFuture<?> future;

    @GetMapping("/start")
    public String start(@RequestParam("id") Integer id) {
        String cron = cronRepository.findCronByCronIdEquals(id).getCron();
        future = threadPoolTaskScheduler.schedule(new MyRunnable(id), new CronTrigger(cron));
        log.info("定时任务" + id + "启动");
        return "定时任务启动";
    }

    @GetMapping("/stop")
    public String stopCron(@RequestParam("id") Integer id) {
        if (future != null) {
            future.cancel(true);
        }
        log.info("定时任务" + id + "停止");
        return "定时任务停止";
    }

    @PostMapping("/change")
    public String updateCron(@RequestBody Cron cron) {
        stopCron(cron.getCronId());
        System.out.println(cron);
        future = threadPoolTaskScheduler.schedule(new MyRunnable(cron.getCronId()), new CronTrigger(cron.getCron()));
        cronRepository.updateCron(cron.getCron(), cron.getCronId());
        return "修改定时任务设置";
    }


    private static class MyRunnable implements Runnable {

        private Integer id;

        public MyRunnable(Integer id) {
            this.id = id;
        }

        @Override
        public void run() {
            log.info("我是定时任务" + id + "：" + LocalDateTime.now());
        }
    }
}
