package com.twcch.test.operandandoperator;

import java.util.Scanner;

public class RelationalOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入第1個數值: ");
        int a = input.nextInt();

        System.out.print("請輸入第2個數值: ");
        int b = input.nextInt();

        System.out.println("a > b: " + (a > b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));

    }

}
