package com.soft1851.springboot.schedule.servier;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

import java.util.HashMap;
import java.util.Map;


@SpringBootTest
class MailServiceTest {

    @Resource
    private MailService mailService;

    @Test
    void sendSimpleTextMail() {
        String to = "2538412696@qq.com";
        String subject = "SpringBoot 发送简单文本邮件";
        String content = "<h3>第一封 SpringBoot 简单文本邮件，pi今天过瘾啦</h3>";
        mailService.sendSimpleTextMail(to, subject, content);
    }

    @Test
    void sendAttachmentMail() throws Exception {
        String to = "2538412696@qq.com";
        String subject = "SpringBoot 发送简单文本邮件";
        String content = "<h3>第一封 SpringBoot 简单文本邮件，pi今天过瘾啦</h3>";
        mailService.sendHtmlMail(to, subject, content);

    }

    @Test
    void testSendAttachmentMail() throws Exception {
        String to = "2538412696@qq.com";
        String subject = "SpringBoot 发送简单文本邮件";
        String content = "<h3>第一封 SpringBoot 附件邮件，pi今天过瘾啦</h3>";
        String filePath = "pom.xml";
        mailService.sendAttachmentMail(to, subject, content, filePath, filePath);
    }

    @Test
    void sendImgMail() throws Exception {
//        String to = "2538412696@qq.com";
        String to = "1224178565@qq.com";
        String subject = "SpringBoot 发送简单文本邮件";
        String content = "<h2>第一封 SpringBoot 图片邮件，pi今天过瘾啦</h2><br /><img src=\"cid:img01\" />";
        String imgPath = "E:\\图库\\情头\\lover_27.2.jpg";
        Map<String, String> imgMap = new HashMap<>();
        // 以键值对的形式存入
        imgMap.put("img01", imgPath);
        mailService.sendImgMail(to, subject, content, imgMap);
    }
}