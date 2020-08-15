package com.java.practice.ptwo;

public class Bus {
    private String color;
    private int speed;


    public Bus(String color) {
        this.color = color;
    }

    public Bus(String color, int speed) {
        this.color = color;
        this.speed = speed;
    }

    public void GetParam() {
        System.out.println(this.color);
        System.out.println(this.speed);
        //
    }
}