package com.java.practice.p6;

public class Client extends Person {

    private int wage;

    public Client(String name, int age, int wage) {
        super(name, age);
        this.wage = wage;
    }

    public int getWage() {
        return wage;
    }

    @Override
    public void ShowInfo() {
        System.out.println("Name: " + super.getName());
        System.out.println("Age: " + super.getAge());
        System.out.println("Wage: " + wage);
    }
}