package com.twcch.ocajp.object;

public class SectionTwo {

    int z;

    public static void main(String[] args) {

        SectionTwo t = new SectionTwo();
        int z = 6;
        System.out.print(z);
        t.method1();
        System.out.print(z);
        System.out.print(t.z);

    }

    void method1() {
        int z = 5;
        method2();
        System.out.print(z);
    }

    void method2() {
        z = 4;
    }

}
