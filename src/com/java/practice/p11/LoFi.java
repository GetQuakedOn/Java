package com.java.practice.p11;

public class LoFi implements Music {

    private String song;

    public LoFi(String song) {
        this.song = song;
    }

    public String getSong() {
        return song;
    }

    @Override
    public void Play() {
        System.out.println("Playing: " + song);
    }
}
