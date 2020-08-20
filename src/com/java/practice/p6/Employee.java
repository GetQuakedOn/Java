package com.java.practice.p6;

public class Employee extends Person {

    private int age;

    public Employee(String name, int age) {
        super(name);
        this.age = age;
    }

    @Override
    public void ShowInfo() {
        System.out.println(super.getName());
        System.out.println(age);
    }
}
