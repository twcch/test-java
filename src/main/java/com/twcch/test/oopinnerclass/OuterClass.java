package com.twcch.test.oopinnerclass;

public class OuterClass {

    public void callInnerClass() {

        InnerClass innerClass = new InnerClass();
        innerClass.name = "Alan";
        innerClass.sayHello();

    }

    private class InnerClass {

        private String name;

        public void sayHello() {

            System.out.println("Hello " + name);

        }

    }

}
