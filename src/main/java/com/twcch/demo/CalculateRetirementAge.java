package com.twcch.demo;

import java.util.Calendar;

public class CalculateRetirementAge {

    public static void main(String[] args) {

        int currentOld = 29;
        int retireOld = 65;

        Calendar calendar = Calendar.getInstance();
        int currentYear = calendar.get(Calendar.YEAR);

        int retireYear = retireOld - currentOld + currentYear;

        System.out.println("I can retire in " + retireYear + ".");

    }

}
