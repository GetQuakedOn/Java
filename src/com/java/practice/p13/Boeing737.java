package com.java.practice.p13;

public class Boeing737 extends Aircraft {

    @Override
    public void Fly() {
        System.out.println("Boeing 737 is flying");
    }

    @Override
    public boolean VerticalTakeoff() {
        return false;
    }

    @Override
    public boolean HorizontalTakeoff() {
        return true;
    }
}
