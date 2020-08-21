package com.java.practice.p8;

public class Human {

    private Bicycle bicycle;

    public Human(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public void TwistPedals() {
        bicycle.TwistPedals();
    }

    public void Steer() {
        bicycle.Steer();
    }

}
