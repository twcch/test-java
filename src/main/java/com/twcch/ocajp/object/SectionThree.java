package com.twcch.ocajp.object;

public class SectionThree {

    public static void main(String[] args) {

        String s1 = "Jim";
        String s2 = new String("Jim");

        if (s1.equalsIgnoreCase(s2)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        String s3 = s2;
        if (s1.equals(s3)) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

    }

}
