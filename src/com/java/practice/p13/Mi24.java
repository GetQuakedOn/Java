package com.java.practice.p13;

public class Mi24 extends MilitaryHelicopter implements Ammunitions {

    private final Ammunition AMMUNITION1 = Ammunition.GUN;
    private final Ammunition AMMUNITION2 = Ammunition.MISSILE;

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

    @Override
    public void ShowAmmunitions() {
        System.out.println(AMMUNITION1);
        System.out.println(AMMUNITION2);
    }
}
