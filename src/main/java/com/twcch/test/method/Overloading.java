package com.twcch.test.method;

public class Overloading {

    public static void main(String[] args) {

    }

    public int abs(int value) {
        return (value >= 0) ? value : -value;
    }

    public double abs(double value) {
        return (value >= 0) ? value : -value;
    }

    public float abs(float value) {
        return (value >= 0) ? value : -value;
    }

}
