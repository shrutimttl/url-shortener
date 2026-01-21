package com.example.url_shortener.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.url_shortener.entity.UrlEntity;
import com.example.url_shortener.repository.UrlRepository;
import com.example.url_shortener.utils.Base62Encoder;

@Service
public class UrlService {

    @Autowired
    private UrlRepository repository;
    
    public String shortenUrl(String originalUrl){
        UrlEntity entity=new UrlEntity();
        entity.setOriginalUrl(originalUrl);
        repository.save(entity);
        String shortCode = Base62Encoder.encode(entity.getId());
        entity.setShortUrl(shortCode);
        repository.save(entity);
        return shortCode;
    }

    // public String redirect(String shortCode){

    // }
}
