package com.java.practice.p6;

public class Client extends Employee {

    private String email;

    public Client(String name, int age, String email) {
        super(name, age);
        this.email = email;
    }

    @Override
    public void ShowInfo() {
        super.ShowInfo();
        System.out.println(email);
    }
}
