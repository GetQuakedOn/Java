package com.java.practice.p11;

public class Rock implements Music {

    public String song;

    public Rock(String song) {
        this.song = song;
    }

    @Override
    public void Play() {
        System.out.println("Playing " + song);
    }
}
