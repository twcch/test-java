package com.twcch.test.oopclass;

public class SuperClass { // 設計藍圖

    public String name; // 實例成員

    public SuperClass() { // default constructor

        name = "Someone";

    }

    /*
     * constructor
     * 強制限制開發者在 new 該物件，必須放入哪些資訊
     */
    public SuperClass(String name) {

        this.name = name; // this() 呼叫物件的 constructor

    }

}
