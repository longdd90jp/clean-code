package com.cleancode.homework.phan2.bai2.controller;

import com.cleancode.homework.phan2.bai2.bean.Car;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private Car car;

    @ResponseBody
    @GetMapping(value = "/create-car")
    public String getHome() {
        return car.toString();
    }
}
