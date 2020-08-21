package com.java.practice.p8;

public class MountainBicycle implements Bicycle {

    private String model;

    public MountainBicycle(String model) {
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    @Override
    public void TwistPedals() {
        System.out.println("I'm twist pedals on a " + model);
    }

    @Override
    public void Steer() {
        System.out.println("I'm steer a " + model);
    }
}
