package com.example.url_shortener.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.url_shortener.entity.UrlEntity;

@Repository
public interface UrlRepository extends JpaRepository<UrlEntity, Integer> {

    

} 