package com.java.practice.p9;

public class Machine implements Weapon {

    private String name;
    private float caliber;

    public Machine(String name, float caliber) {
        this.caliber = caliber;
        this.name = name;
    }

    @Override
    public float getCaliber() {
        return caliber;
    }

    public void setCaliber(float caliber) {
        this.caliber = caliber;
    }

    @Override
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void Use() {
        System.out.println("Use " + name);
    }

}
