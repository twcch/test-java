package com.twcch.test.processcontrol;

import java.util.Scanner;

public class DoWhileLoop {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        do {
            System.out.print("請輸入身高: ");
            int height = input.nextInt();
            System.out.println("您的身高: " + height);

            System.out.print("請問要繼續(Y/N): ");
            String str = input.next();
            if (str.equals("Y")) {

            } else {
                // continue 意圖進入下一個迭代(iteration)
                break; // 強制跳離迴圈
            }
        } while (true);

    }

}
