package com.twcch.ocajp.object;

public class SectionOne {

    public static void main(String[] args) {

        Student tom = new Student();
        Student jim = new Student();

        tom.name="Tom";
        tom.age = 25;

        jim = tom; // 把 jim 指向 tom 的 reference
        jim.name = "Jim";

        System.out.println("Tom's name: " + tom.name);

    }

}

class Student {

    public String name = "";
    public int age =0;
    public String major = " undeterminded";
    public boolean fulltime = true;

}