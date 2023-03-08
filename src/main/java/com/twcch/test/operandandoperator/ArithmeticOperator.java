package com.twcch.test.operandandoperator;

import java.util.Scanner;

public class ArithmeticOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入第1個數值: ");
        int a = input.nextInt();

        System.out.print("請輸入第2個數值: ");
        int b = input.nextInt();

        System.out.print("請輸入第3個數值: ");
        int c = input.nextInt();

        /*
         * d = c++; > 1. d = c; 2. c = c + 1;
         * d = ++c; > 1. c = c + 1; 2. d = c;
         */
        int d = c++;

        System.out.println("a + b = " + (a + b)); // 求和
        System.out.println("a - b = " + (a - b)); // 求差
        System.out.println("a * b = " + (a * b)); // 求積
        System.out.println("a / b = " + (a / b)); // 求商
        System.out.println("a % b = " + (a % b)); // 求餘
        System.out.println("c = " + c);
        System.out.println("d = " + d);

        int n = 10;
        System.out.println((n++) + (n++)); // n 會被先利用(將 n 的值設定為運算式的結果)，再遞增
        System.out.println(n);

    }

}
