package com.java.practice.p8;

public class SimpleBicycle implements Bicycle {

    private String model;

    public SimpleBicycle(String model) {
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
