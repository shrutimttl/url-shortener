package com.example.url_shortener.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Data
@Entity
@Table(name="URLDETAILS")
public class UrlEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column(name="original_url",nullable=false)
    private String originalUrl;

    @Column(name="short_url",unique = true)
    private String shortUrl;

    @Column(name="access_count")
    private int accessCount;
}
