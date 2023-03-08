package com.twcch.test.oopclass;

public class MainClass {

    public static void main(String[] args) {

        SuperClass superClass = new SuperClass();
        System.out.println(superClass.name);

        SuperClass superClass1 = new SuperClass("Amy");
        System.out.println(superClass1.name);

        SubClass subClass = new SubClass();
        System.out.println(subClass.nickName);

    }

}
