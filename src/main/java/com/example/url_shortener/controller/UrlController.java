package com.example.url_shortener.controller;

import org.springframework.http.HttpHeaders;

import java.net.URI;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.url_shortener.service.UrlService;

@RestController
@RequestMapping("/api")
public class UrlController {

    @Autowired
    private UrlService urlService;

    @PostMapping("/shorten")
    public ResponseEntity<Map<String,String>> shortenUrl(@RequestBody Map<String,String> req){
        String originalUrl=req.get("url");
        return new ResponseEntity<>(Map.of(originalUrl,urlService.shortenUrl(originalUrl)),HttpStatus.CREATED);
    }

    @GetMapping("/{shortCode}")
    public ResponseEntity<Void> redirectToOriginalUrl(@PathVariable String shortCode){
        String originalUrl=urlService.getOriginalUrl(shortCode);

        HttpHeaders headers=new HttpHeaders();
        headers.setLocation(
            URI.create(originalUrl)
        );
        return new ResponseEntity<>(headers,HttpStatus.FOUND);
    }

}
