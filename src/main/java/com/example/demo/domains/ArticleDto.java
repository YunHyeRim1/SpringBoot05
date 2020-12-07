package com.example.demo.domains;

import org.springframework.stereotype.Component;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Component @Data
public class ArticleDto {
    private String artNum, writerId, title, content, regDate, count;
}