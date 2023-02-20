package com.smuraha.myresume.service.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class MessageToEmailDto {
    private String name;
    private String email;
    private String phone;
    private String subject;
    private String message;
}
