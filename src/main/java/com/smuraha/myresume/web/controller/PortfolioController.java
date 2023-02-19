package com.smuraha.myresume.web.controller;

import com.smuraha.myresume.service.SmtpClient;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
@RequiredArgsConstructor
public class PortfolioController {

    private final SmtpClient smtpClient;

    @GetMapping("/")
    public String getPortfolioPage(){
        return "Portfolio";
    }
    @GetMapping("/mail")
    public void sendMail() throws Exception {
        smtpClient.sendMail("smurahaleha@gmail.com","A new message", """
                Dear reader,
                
                Hello world!.
                
                Best regards,
                myself
                """);
    }
    @GetMapping("/test")
    public String getTestPage(){
        return "test";
    }
}
