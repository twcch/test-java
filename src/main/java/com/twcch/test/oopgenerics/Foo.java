package com.twcch.test.oopgenerics;

public class Foo<T> { // Foo<T extends List> 進入的型別，必須繼承 list 或實作 list

    private T foo;

    public T getFoo() {
        return foo;
    }

    public void setFoo(T foo) {
        this.foo = foo;
    }

}
