package com.smuraha.myresume.web.controller;

import com.smuraha.myresume.service.SmtpClient;
import com.smuraha.myresume.service.dto.MessageToEmailDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequiredArgsConstructor
public class PortfolioController {

    private final SmtpClient smtpClient;

    @GetMapping("/")
    public String getPortfolioPage(){
        return "Portfolio";
    }

    @PostMapping("/mail")
    @ResponseBody
    public String sendMail(@RequestBody MessageToEmailDto message) throws Exception {
        return smtpClient.sendMail(message);
    }
    @GetMapping("/test")
    public String getTestPage(){
        return "test";
    }
}
