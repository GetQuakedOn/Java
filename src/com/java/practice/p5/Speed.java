package com.java.practice.p5;

public enum Speed {
    MIN(40), RECOMMEND(60), MAX(90);

    private int speed;

    Speed(int speed) {
        this.speed = speed;
    }

    public String getSpeed() {
        return "Speed is " + this.speed;
    }
}
