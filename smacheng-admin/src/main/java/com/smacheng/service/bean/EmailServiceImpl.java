/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.smacheng.service.bean;

import java.util.Locale;
import java.util.ResourceBundle;

import javax.annotation.Resource;

import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSenderImpl;
import org.springframework.stereotype.Service;

import com.smacheng.commons.config.EmailConfig;
import com.smacheng.commons.enums.EmailType;
import com.smacheng.service.ConfigService;
import com.smacheng.service.EmailService;

/**
 *
 * @author Administrator
 */
@Service("emailServiceImpl")
public class EmailServiceImpl implements EmailService {

    @Resource(name = "javaMailSender")
    private JavaMailSenderImpl javaMailSender;

    @Resource(name = "configServiceImpl")
    private ConfigService configService;

    @Override
    public void send(EmailType emailType, String toMail, String subject, String... contents) {
        ResourceBundle resourceBundle = ResourceBundle.getBundle("com.smacheng.email.messages", Locale.getDefault());
        String contentTemplate = resourceBundle.getString(emailType.getKey());
        String content = "";
        switch (emailType) {
            case MEMBER_RESET_PASSWORD:
                content = String.format(contentTemplate, contents[0],contents[1]);
                break;
            case ADMIN_RESET_PASSWORD:
                content = String.format(contentTemplate, contents[0]);
                break;
            case MARKET_REGISTER_ACTIVE:
                content = String.format(contentTemplate, contents[0]);
                break;
            default:
                content = "请设置邮件模板";
            // nothing todo...
        }
        sendEmail(toMail, subject, content);
    }

    /**
     * 发送邮件
     *
     * @param toMail
     * @param subject
     * @param content
     */
    public void sendEmail(String toMail, String subject, String content) {
        EmailConfig config = configService.getEmailConfig();

        javaMailSender.setHost(config.getSmtpHost());
        javaMailSender.setPort(config.getSmtpPort());
        javaMailSender.setUsername(config.getSmtpUsername());
        javaMailSender.setPassword(config.getSmtpPassword());

        SimpleMailMessage simpleMailMessage = new SimpleMailMessage();
        simpleMailMessage.setFrom(config.getSmtpFromMail());
        simpleMailMessage.setTo(toMail);
        simpleMailMessage.setSubject(subject);
        simpleMailMessage.setText(content);

        javaMailSender.send(simpleMailMessage);
    }

}
