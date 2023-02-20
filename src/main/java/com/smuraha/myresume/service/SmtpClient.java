package com.smuraha.myresume.service;

import com.smuraha.myresume.service.dto.MessageToEmailDto;

public interface SmtpClient {
    String sendMail(MessageToEmailDto message) throws Exception;
}
