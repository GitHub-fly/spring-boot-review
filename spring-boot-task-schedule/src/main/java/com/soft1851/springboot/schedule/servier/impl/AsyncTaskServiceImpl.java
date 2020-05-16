package com.soft1851.springboot.schedule.servier.impl;

import com.soft1851.springboot.schedule.servier.AsyncTaskService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

/**
 * @author xunmi
 * @ClassName AsyncTaskService
 * @Description TODO
 * @Date 2020/5/17
 * @Version 1.0
 **/
@Service
@Slf4j
public class AsyncTaskServiceImpl implements AsyncTaskService {

    @Override
    @Async
    public void asyncTask() {
        try {
            Thread.sleep(5000);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
