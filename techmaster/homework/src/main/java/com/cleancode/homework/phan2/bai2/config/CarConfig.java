package com.cleancode.homework.phan2.bai2.config;

import com.cleancode.homework.phan2.bai2.bean.Car;
import com.cleancode.homework.phan2.bai2.bean.Engine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CarConfig {
    @Autowired
    private ApplicationContext context;

    @Value("${engineType}")
    private String engineType;

    @Bean
    public Car car() {
        Engine engine;
        switch (engineType) {
            case "gas":
                engine = (Engine) context.getBean("gasEngine");
                break;
            case "electric":
                engine = (Engine) context.getBean("electricEngine");
                break;
            case "hybrid":
                engine = (Engine) context.getBean("hybridEngine");
                break;
            default:
                engine = (Engine) context.getBean("gasEngine");
        }
        return new Car(engine);
    }
}
