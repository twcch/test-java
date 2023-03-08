package com.twcch.test.referencetype;

public class StringCompare {

    public static void main(String[] args) {

        String str1 = "abcd";
        String str2 = "abcd";

        String str3 = new String(new char[]{'a', 'b', 'c'});
        String str4 = new String(new char[]{'a', 'b', 'c'});

        System.out.println(str1 == str2); // 避免使用 == 比較 String，因為 == 是比較數值，這樣比較兩個 String 的 reference
        System.out.println(str3 == str4); // 避免使用 == 比較 String，因為 == 是比較數值，這樣比較兩個 String 的 reference
        System.out.println(str1.equals(str2));
        System.out.println(str3.equals(str4));

    }

}
