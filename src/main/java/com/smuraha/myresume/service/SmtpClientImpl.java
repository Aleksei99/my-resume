package com.smuraha.myresume.service;

import com.smuraha.myresume.service.dto.MessageToEmailDto;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

@Service
@Slf4j
public class SmtpClientImpl implements SmtpClient {
    @Autowired
    private JavaMailSender mailSender;

    public String sendMail(MessageToEmailDto message) {
        try {
            SimpleMailMessage msg = new SimpleMailMessage();
            msg.setFrom("fromemail@gmail.com");
            msg.setTo("smurahaleha@gmail.com");
            msg.setText(buildMessage(message));
            msg.setSubject(message.getSubject());
            mailSender.send(msg);
            return "success";
        }catch (Exception e){
            log.error("Error in sendMail",e);
            return "Error!";
        }
    }

    private String buildMessage(MessageToEmailDto message) {
        return message.getMessage() +
                "\n\nFrom " + message.getName() +
                "\nEmail " + message.getEmail() +
                (message.getPhone().isBlank() ? "" : "\nPhone ") + message.getPhone();

    }
}
