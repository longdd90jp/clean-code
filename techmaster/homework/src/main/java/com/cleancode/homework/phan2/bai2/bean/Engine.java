package com.cleancode.homework.phan2.bai2.bean;

public class Engine {
    private String model;

    public String getModel() {
        return model;
    }

    public Engine(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return model;
    }
}
