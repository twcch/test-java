package com.twcch.demo.imgdownload;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("請輸入圖片網址: ");

        try {
            // download image
            URL url = new URL(scanner.nextLine());
            File destFile = new File("C:\\Users\\twcch\\OneDrive\\桌面\\1.jpg");

            FileUtils.copyURLToFile(url, destFile);

            System.out.println("下載完成");
        } catch (IOException e) {
            System.out.println("下載失敗");
        }

    }

}
