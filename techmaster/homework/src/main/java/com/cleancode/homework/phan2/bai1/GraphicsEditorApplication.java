package com.cleancode.homework.phan2.bai1;

public class GraphicsEditorApplication {
    public static void main(String[] args) {
        // process file BMP
        iFile fileBMP = new FileBMP();
        processImageFile(fileBMP);

        // process file GIF
        iFile fileGIF = new FileGIF();
        processImageFile(fileGIF);

        // process file PNG
        iFile filePNG = new FilePNG();
        processImageFile(filePNG);

        // process file JPG
        iFile fileJPG = new FileJPG();
        processImageFile(fileJPG);
    }

    private static void processImageFile(iFile fileIMG) {
        fileIMG.openFile();
        fileIMG.parseFile();
        fileIMG.saveFile();
    }
}
