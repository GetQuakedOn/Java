package com.java.practice.p12;

public class Cat extends Animal {

    @Override
    public void eat() {
        System.out.println("Cat eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    public void meow() {
        System.out.println("Meow - meow");
    }
}
