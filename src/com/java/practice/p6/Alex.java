package com.java.practice.p6;

public class Alex extends Human {

    private int age;

    public Alex(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println(age);
    }
}
