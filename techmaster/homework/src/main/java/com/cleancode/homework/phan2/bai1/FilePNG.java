package com.cleancode.homework.phan2.bai1;

public class FilePNG implements iFile {
    @Override
    public void openFile() {
        System.out.println("Call openFile PNG DONE!");
    }

    @Override
    public void parseFile() {
        System.out.println("Call parseFile PNG DONE!");
    }

    @Override
    public void saveFile() {
        System.out.println("Call saveFile PNG DONE!");
    }
}
