package com.cleancode.homework.phan2.bai1;

public class FileJPG implements iFile {
    @Override
    public void openFile() {
        System.out.println("Call openFile JPG DONE!");
    }

    @Override
    public void parseFile() {
        System.out.println("Call parseFile JPG DONE!");
    }

    @Override
    public void saveFile() {
        System.out.println("Call saveFile JPG DONE!");
    }
}
