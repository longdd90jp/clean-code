package com.cleancode.homework.phan2.bai2.config;

import com.cleancode.homework.phan2.bai2.bean.Engine;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class EngineConfig {
    @Bean
    public Engine gasEngine() {
        return new Engine("Gas Engine");
    }

    @Bean(name = "electricEngine")
    public Engine teslaEngine() {
        return new Engine("Tesla Electric Engine");
    }

    @Bean(name = "hybridEngine")
    public Engine dongcoLai() {
        return new Engine("Hybrid Engine");
    }
}