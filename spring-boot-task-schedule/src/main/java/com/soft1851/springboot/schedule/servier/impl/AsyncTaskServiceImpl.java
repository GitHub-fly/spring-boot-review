package com.soft1851.springboot.schedule.servier.impl;

import com.soft1851.springboot.schedule.servier.AsyncTaskService;
import com.soft1851.springboot.schedule.servier.MailService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.HashMap;
import java.util.Map;

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

    @Resource
    private MailService mailService;

    @Override
    @Async
    public void asyncTask() {
        try {
            Thread.sleep(5000);
            String to = "1224178565@qq.com";
            String subject = "SpringBoot 发送简单文本邮件";
            String content = "<h2>第一封 SpringBoot 图片邮件，pi今天过瘾啦</h2><br /><img src=\"cid:img01\" />";
            String imgPath = "E:\\图库\\情头\\lover_27.2.jpg";
            Map<String, String> imgMap = new HashMap<>();
            // 以键值对的形式存入
            imgMap.put("img01", imgPath);
            mailService.sendImgMail(to, subject, content, imgMap);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
