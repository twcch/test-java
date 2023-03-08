/*
 * Github: https://github.com/twcch
 * Website: https://twcch.github.io/
 * Author: 謝志謙 Alan Hsieh
 */

package com.twcch.ocajp.processcontrol;

public class SectionTwo {

    public static void main(String[] args) {

        String[] names = new String[]{"jim", "jerry", "jim"};
        int counter = 0;
        if ("jim".equals(names[0])) {
            counter++;
        } else if ("jim".equals(names[1])) {
            counter++;
        } else if ("jim".equals(names[2])) {
            counter++;
        }
        System.out.println(counter);

    }

}
