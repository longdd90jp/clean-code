package com.cleancode.homework.phan2.bai5;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class BlogApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(BlogApplication.class, args);
        // todo add example for bellow model action
        // 1. User write Posts, delete Posts
        // 2. User comment other post, delete self comment
    }
}
