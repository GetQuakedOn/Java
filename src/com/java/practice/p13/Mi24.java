package com.java.practice.p13;

public class Mi24 extends Helicopter implements Takeoff {

    @Override
    public void Fly() {
        System.out.println("Mi-24 is flying");
    }

    @Override
    public boolean VerticalTakeoff() {
        return true;
    }

    @Override
    public boolean HorizontalTakeoff() {
        return true;
    }
}
