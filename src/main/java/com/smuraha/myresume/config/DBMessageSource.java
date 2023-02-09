package com.smuraha.myresume.config;

import com.smuraha.myresume.dao.Translations;
import com.smuraha.myresume.dao.repository.TranslationsRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.context.support.AbstractMessageSource;
import org.springframework.stereotype.Component;

import java.text.MessageFormat;
import java.util.Locale;

@Component("messageSource")
@RequiredArgsConstructor
public class DBMessageSource extends AbstractMessageSource {

    private final TranslationsRepository translationsRepository;
    private static final String DEFAULT_LOCALE_CODE = "en";

    @Override
    protected MessageFormat resolveCode(String code, Locale locale) {
        Translations message = translationsRepository.findByMessageKeyAndLocale(code, locale.getLanguage());
        if (message == null) {
            message = translationsRepository.findByMessageKeyAndLocale(code, DEFAULT_LOCALE_CODE);
        }
        return new MessageFormat(message.getMessageContent(), locale);
    }
}
