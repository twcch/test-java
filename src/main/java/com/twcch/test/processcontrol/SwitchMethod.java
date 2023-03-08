package com.twcch.test.processcontrol;

import java.util.Scanner;

public class SwitchMethod {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("請問想要喝什麼? (0-可樂, 1-雪碧, 2-黑松沙士): ");
        int drink = input.nextInt();

        /*
         * switch 只限使用以下:
         * 1. 整數型態 (short, int, long, byte, char)
         * 2. 字串 (String)
         * 3. 列舉
         */
        switch (drink) {
            case 0:
                System.out.println("你點了可樂!");
                break;
            case 1:
                System.out.println("你點了雪碧!");
                break;
            case 2:
                System.out.println("你點了黑松沙士!");
                break;
            default:
                System.out.println("沒有賣喔!");
                break;
        }

    }

}
