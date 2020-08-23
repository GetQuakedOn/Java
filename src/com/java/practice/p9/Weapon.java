package com.java.practice.p9;

public interface Weapon {

    default void Use() {
        System.out.println("Use weapon");
    }

    public String getName();
    public float getCaliber();

}
