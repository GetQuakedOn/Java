package com.java.practice.p10;

public class Person {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void Method() {
        System.out.println("Person's method");
    }

    public void Display() {
        System.out.println("Name: " + name);
    }

}
