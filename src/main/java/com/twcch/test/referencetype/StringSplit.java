package com.twcch.test.referencetype;

public class StringSplit {

    public static void main(String[] args) {

        String str = "test1, test2, test3";
        String[] strings = str.split(",");

        System.out.println(strings[0]);
        System.out.println(strings[1].trim());
        System.out.println(strings[2].trim());

    }

}
