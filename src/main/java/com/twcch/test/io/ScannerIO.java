package com.twcch.test.io;

import java.util.Scanner;

public class ScannerIO {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入您的姓名: ");
        String name = input.next();
        System.out.print("請輸入身高(cm): ");
        double height = input.nextInt();
        System.out.print("請輸入體重(kg): ");
        double weight = input.nextInt();

        double bmi = weight / Math.pow((height / 100), 2);

        System.out.println(name + " 您好，您的 BMI 是 " + bmi);

        input.close();

    }

}
