package com.example.url_shortener.controller;

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

    // @PostMapping("/shorten")
    // public ResponseEntity<String> shortenUrl(@RequestBody String originalUrl){
    //     return new ResponseEntity<>(urlService.shortenUrl(originalUrl),HttpStatus.CREATED);
    // }

    // @GetMapping("/{shortCode}")
    // public String redirectToOriginalUrl(@PathVariable String shortCode){
    //     String originalUrl=urlService.redirect(shortCode);

    //     return new ResponseEntity<>(urlService.)
    // }

}
