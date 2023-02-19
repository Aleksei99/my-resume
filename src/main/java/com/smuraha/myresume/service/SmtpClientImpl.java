package com.smuraha.myresume.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
public class SmtpClientImpl implements SmtpClient {
    @Autowired
    private JavaMailSender mailSender;

    public void sendMail(String toEmail,String subject,String message) {
        SimpleMailMessage msg = new SimpleMailMessage();
        msg.setFrom("fromemail@gmail.com");
        msg.setTo(toEmail);
        msg.setText(message);
        msg.setSubject(subject);
        mailSender.send(msg);
        System.out.println("Mail Send...");


    }
}
