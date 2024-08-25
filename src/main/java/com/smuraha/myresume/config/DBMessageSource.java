package com.smuraha.myresume.config;

import com.smuraha.myresume.data.Translations;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Locale;

@Component("messageSource")
@RequiredArgsConstructor
public class DBMessageSource extends AbstractMessageSource {

    private final Translations translations;
    private static final String DEFAULT_LOCALE_CODE = "en";

    @Override
    protected MessageFormat resolveCode(String code, Locale locale) {
        String message = translations.findByMessageKeyAndLocale(code, locale.getLanguage());
        if (message == null) {
            message = translations.findByMessageKeyAndLocale(code, DEFAULT_LOCALE_CODE);
        }
        return new MessageFormat(message, locale);
    }
}
