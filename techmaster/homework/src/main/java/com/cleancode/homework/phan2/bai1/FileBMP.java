package com.cleancode.homework.phan2.bai1;

public class FileBMP implements iFile {
    @Override
    public void openFile() {
        System.out.println("Call openFile BMP DONE!");
    }

    @Override
    public void parseFile() {
        System.out.println("Call parseFile BMP DONE!");
    }

    @Override
    public void saveFile() {
        System.out.println("Call saveFile BMP DONE!");
    }
}
