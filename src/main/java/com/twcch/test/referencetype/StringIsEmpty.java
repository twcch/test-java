package com.twcch.test.referencetype;

public class StringIsEmpty {

    public static void main(String[] args) {

        String str1 = "abc";
        String str2 = "";

        System.out.println(str1.isEmpty());
        System.out.println(str2.isEmpty());

        System.out.println(str1.isBlank());
        System.out.println(str2.isBlank());

        System.out.println(str1.length() == 0);
        System.out.println(str2.length() == 0);

    }

}
