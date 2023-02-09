package com.smuraha.myresume.dao;

import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Translations extends BaseEntity{

    private String locale;
    private String messageKey;
    private String messageContent;

}
