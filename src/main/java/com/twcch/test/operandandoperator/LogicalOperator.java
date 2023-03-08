package com.twcch.test.operandandoperator;

import java.util.Scanner;

public class LogicalOperator {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("請輸入國文成績: ");
        float a = input.nextFloat();

        System.out.print("請輸入英文成績: ");
        float b = input.nextFloat();

        System.out.print("請輸入數學成績: ");
        float c = input.nextFloat();

        /*
         * float average = (a + b + c) / 3; > 會先將 int 3 轉型為 float 3，程式會多執行一步，效率變差
         * float average = (a + b + c) / 3F; > 3 已經為 float，不需要再做轉型
         */
        float average = (a + b + c) / 3F;

        if (average >= 60 && a > 0 && b > 0 && c > 0) {
            System.out.println("錄取!");
        } else {
            System.out.println("不錄取!");
        }

        System.out.println(!(true));

        /*
         * ^ 運算元相反為真
         */
        System.out.println(true ^ false);
        System.out.println(true ^ true);

    }

}
