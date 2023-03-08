package com.twcch.test.processcontrol;

import java.util.Scanner;

public class WhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入列印次數: ");
        int count = input.nextInt(); // 執行迴圈總次數

        int i = 0; // 計數器初始化
        while (i < count) { // 條件
            System.out.println("Hello World;");
            i++; // 變動計數器
        }

    }

}
