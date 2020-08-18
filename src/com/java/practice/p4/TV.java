package com.java.practice.p4;

import com.java.practice.p5.Status;

public class TV {
    Status status;
    private int numOfChannel;
    private int soundVolume;
    private static int ID = 0;

    public TV(int numOfChannel, int soundVolume) {
        this.numOfChannel = numOfChannel;
        this.soundVolume = soundVolume;
        ID++;
    }

    public static int getID() {
        return ID;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Status getStatus() {
        return this.status;
    }

    public int getNumOfChannel() {
        return numOfChannel;
    }

    public void setNumOfChannel(int numOfChannel) {
        this.numOfChannel = numOfChannel;
    }

    public int getSoundVolume() {
        return soundVolume;
    }

    public void setSoundVolume(int soundVolume) {
        this.soundVolume = soundVolume;
    }

    public void GetParam() {
        System.out.println(numOfChannel);
        System.out.println(soundVolume);
    }
}
