package com.java.practice.p6;

public class Human {

    private String name;
    private int age;

    public Human() {
        System.out.println(Human.class);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
