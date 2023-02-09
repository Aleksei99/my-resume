package com.smuraha.myresume.dao.repository;

import com.smuraha.myresume.dao.Translations;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TranslationsRepository extends JpaRepository<Translations, Integer> {
    Translations findByMessageKeyAndLocale(String key,String locale);
}