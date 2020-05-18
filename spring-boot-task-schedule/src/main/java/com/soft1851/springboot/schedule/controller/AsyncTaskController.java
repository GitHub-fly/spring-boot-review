package com.soft1851.springboot.schedule.controller;

import com.soft1851.springboot.schedule.servier.AsyncTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author xunmi
 * @ClassName AsyncTaskController
 * @Description TODO
 * @Date 2020/5/17
 * @Version 1.0
 **/
@RestController
@Slf4j
public class AsyncTaskController {

    @Resource
    private AsyncTaskService asyncTaskService;

    @RequestMapping("/asyncTask")
    public String asyncTask() {
        asyncTaskService.asyncTask();
        return "邮件发送成功";
    }
}
