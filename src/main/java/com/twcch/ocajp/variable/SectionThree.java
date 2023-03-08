/*
 * Github: https://github.com/twcch
 * Website: https://twcch.github.io/
 * Author: 謝志謙 Alan Hsieh
 */

package com.twcch.ocajp.variable;

public class SectionThree {

    public static void main(String[] args) {

        SectionThree sectionThree = new SectionThree();
        sectionThree.method("800");

    }

    String str = "600";
    public void method(String s) {
        int i = 0;
        try {
            String str = s;
            i = Integer.parseInt(str);
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
        System.out.println("String: " + str + ", Integer: " + i);
    }

}
