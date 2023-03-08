package com.twcch.test.referencetype;

public class StringCharAt {

    public static void main(String[] args) {

        char[] chars = {'a', 'b', 'c'};
        String str = new String(chars);

        System.out.println(str);
        System.out.println(str.charAt(1));

    }

}
