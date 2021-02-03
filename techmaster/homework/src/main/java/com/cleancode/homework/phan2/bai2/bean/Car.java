package com.cleancode.homework.phan2.bai2.bean;

public class Car {
    private Engine engine;

    public Car(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car [engine=" + engine + "]";
    }
}
