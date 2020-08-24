package com.java.practice.p12;

public class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("Dog eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog is sleeping");
    }

    public void woof() {
        int i = this.hashCode();
        System.out.println("Woof - woof   " + i);
    }
}
