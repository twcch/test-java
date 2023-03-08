package com.twcch.ocajp.object;

public class SectionFour {

    public static void main(String[] args) {

        StringBuilder stringBuilder = new StringBuilder(0);
        String s = "";

        if (stringBuilder.equals(s)) {
            System.out.println("Case 1");
        } else if (stringBuilder.toString().equals(s.toString())) {
            System.out.println("Case 2");
        } else {
            System.out.println("Case 3");
        }

    }

}
