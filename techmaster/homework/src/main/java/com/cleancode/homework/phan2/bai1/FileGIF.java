package com.cleancode.homework.phan2.bai1;

public class FileGIF implements iFile {
    @Override
    public void openFile() {
        System.out.println("Call openFile FileGIF DONE!");
    }

    @Override
    public void parseFile() {
        System.out.println("Call parseFile FileGIF DONE!");
    }

    @Override
    public void saveFile() {
        System.out.println("Call saveFile FileGIF DONE!");
    }
}
