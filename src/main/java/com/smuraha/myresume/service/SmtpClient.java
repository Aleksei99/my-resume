package com.smuraha.myresume.service;

public interface SmtpClient {
    void sendMail(String toEmail,String subject,String message) throws Exception;
}
