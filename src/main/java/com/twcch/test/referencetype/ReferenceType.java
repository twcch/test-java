package com.twcch.test.referencetype;

import java.util.Scanner;

public class ReferenceType {

    public static void main(String[] args) {

        /*
         * new: 實作了一個 Scanner 物件 input
         * Scanner(): 建構函式
         * System.in: 建構函式參數
         */
        Scanner input = new Scanner(System.in);

        /*
        * reference type: String
        * String 是 char 的陣列
        */
        String str = "Hello"; // = String str = new String(new char[]{'H', 'e', 'l', 'l', 'o'});
        System.out.println("str: " + str);

    }

}
