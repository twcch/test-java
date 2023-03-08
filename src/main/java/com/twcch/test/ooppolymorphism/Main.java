package com.twcch.test.ooppolymorphism;

public class Main {

    public static void main(String[] args) {

        Multimedia multimedia1 = new Multimedia();
        multimedia1.play();

        Multimedia multimedia2 = new Video(); // polymorphism
        multimedia2.play();

        Video video = new Video();
        video.play();

        Video video1 = new Video();
        Multimedia multimedia = video1; // 向上轉型
        multimedia.play();

        Multimedia multimedia3 = new Video();
        Video video2 = (Video) multimedia3; // 向下轉型
        video2.play();

    }

}
