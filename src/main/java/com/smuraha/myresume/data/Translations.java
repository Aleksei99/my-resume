package com.smuraha.myresume.data;

import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;

@Service
public class Translations {

    static Map<String, String> translationMap = new HashMap<>();

    static {

        translationMap.put("home.welcome" + "en", "Welcome");
        translationMap.put("home.info" + "en", "This page is displayed in English.");
        translationMap.put("home.changelanguage" + "en", "Supported languages :");
        translationMap.put("home.lang.en" + "en", "English");
        translationMap.put("home.lang.ru" + "en", "Russian");

        translationMap.put("home.welcome" + "ru", "Добро пожаловать");
        translationMap.put("home.info" + "ru", "Эта страница отображена на русском.");
        translationMap.put("home.changelanguage" + "ru", "Поддерживаемые языки : ");
        translationMap.put("home.lang.en" + "ru", "Английский");
        translationMap.put("home.lang.ru" + "ru", "Русский");

    }

    public String findByMessageKeyAndLocale(String code, String locale) {

        String compositeKey = code + locale;

        return translationMap.get(compositeKey);

    }

}

