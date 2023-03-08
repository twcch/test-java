package com.twcch.test.processcontrol;

import java.util.Scanner;

public class IfMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入整數: ");
        int i = input.nextInt();

        if (i == 0) {
            System.out.println("輸入的數值為零!");
        } else if (i % 2 == 0) {
            System.out.println("輸入的數值為偶數!");
        } else {
            System.out.println("輸入的數值為奇數!");
        }

    }

}
