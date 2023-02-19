package com.smuraha.myresume.dao;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Entity;

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
