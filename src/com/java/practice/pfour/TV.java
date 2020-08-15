package com.java.practice.pfour;

public class TV {
    public boolean isOn;
    public int numOfChannel;
    public int soundVolume;

    public TV(boolean isOn, int numOfChannel, int soundVolume) {
        this.isOn = isOn;
        this.numOfChannel = numOfChannel;
        this.soundVolume = soundVolume;
    }

    public void GetParam() {
        System.out.println(isOn);
        System.out.println(numOfChannel);
        System.out.println(soundVolume);
    }
}
