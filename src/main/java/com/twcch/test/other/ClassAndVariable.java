package com.twcch.test.other;

public class ClassAndVariable {
    /*
     * 屬性():
     * 可提供給其他物件使用
     * 可提供給方法使用
     * 變數無須初始化
     * 有修飾子
     */
    static String name = "Alan";
    int age;

    public static void main(String[] args) {
        /*
         * 區域變數(local variables):
         * 不可提供給其他物件使用
         * 不可提供給方法使用
         * 變數必須初始化
         * 沒有修飾子
         */

        ClassAndVariable classAndVariable = new ClassAndVariable();
        classAndVariable.age = 29; // dim variable and initialize
        final String GENDER = "Male"; // dim constant and initialize

        System.out.println("My name is " + name + ", " + GENDER + ", I'm " + classAndVariable.age + " years old.");

    }

}
