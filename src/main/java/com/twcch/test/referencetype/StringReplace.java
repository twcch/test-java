package com.twcch.test.referencetype;

public class StringReplace {

    public static void main(String[] args) {

        String str = "abc";
        str = str.replace("a", "1");
        System.out.println(str);

        // java.util.regex

        String str2 = "abc123";
        str2 = str2.replaceAll("[a-zA-Z]", "9");
        System.out.println(str2);

    }

}
