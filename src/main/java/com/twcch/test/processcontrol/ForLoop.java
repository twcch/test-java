package com.twcch.test.processcontrol;

import java.util.Scanner;

public class ForLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入列印次數: ");
        int i = input.nextInt();

        for (int j = 0; j < i; j++) {
            System.out.println("Hello World!");
        }

    }

}
