package com.cleancode.homework.restfulapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class CourseManagementApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext context = SpringApplication.run(CourseManagementApplication.class, args);
    }
}
