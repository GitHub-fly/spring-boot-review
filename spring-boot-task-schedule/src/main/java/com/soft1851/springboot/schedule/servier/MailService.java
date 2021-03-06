package com.soft1851.springboot.schedule.servier;

import javax.mail.Message;
import javax.mail.MessageRemovedException;
import javax.mail.MessagingException;
import java.util.Map;

/**
 * @author xunmi
 * @ClassName MailService
 * @Description TODO
 * @Date 2020/5/15
 * @Version 1.0
 **/
public interface MailService {

    /**
     * 发送简单的文本邮件
     *
     * @param to
     * @param subject
     * @param content
     */
    void sendSimpleTextMail(String to, String subject, String content);

    /**
     * 发送 HTML 邮件
     *
     * @param to
     * @param subject
     * @param content
     * @throws MessagingException
     */
    void sendHtmlMail(String to, String subject, String content) throws MessagingException;

    /**
     * 附件邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param fileArr
     * @throws MessagingException
     */
    void sendAttachmentMail(String to, String subject, String content, String... fileArr) throws MessagingException;

    /**
     * 图片邮件
     *
     * @param to
     * @param subject
     * @param content
     * @param imgMap
     * @throws MessagingException
     */
    void sendImgMail(String to, String subject, String content, Map<String, String> imgMap) throws MessagingException;
}
