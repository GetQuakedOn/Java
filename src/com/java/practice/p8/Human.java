package com.java.practice.p8;

import com.java.practice.p9.*;

public class Human {

    private Bicycle bicycle;
    private Weapon weapon;

    public Human(Bicycle bicycle) {
        this.bicycle = bicycle;
    }

    public Human(Weapon weapon) {
        this.weapon = weapon;
    }

    public Human(Bicycle bicycle, Weapon weapon) {
        this.bicycle = bicycle;
        this.weapon = weapon;
    }

    public void TwistPedals() {
        bicycle.TwistPedals();
    }

    public void Steer() {
        bicycle.Steer();
    }

    public String getName() {
        return weapon.getName();
    }

    public float getCaliber() {
        return weapon.getCaliber();
    }

    public void Use() {
        weapon.Use();
    }

}
