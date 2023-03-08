package com.twcch.demo.polymorphismdemo;

public class Main {

    public static void main(String[] args) {

        Animal[] animals = new Animal[]{new Cat("喵"), new Dog("汪")};

        for (Animal animal : animals) {
            System.out.print(animal.getName() + ": ");
            animal.talk();
        }

    }

}
