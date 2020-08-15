package com.java.practice.pone;

import com.java.practice.pfour.TV;

public class Main {

    public static void main(String[] args) {

        TV tv1 = new TV(true, 1, 70);
        TV tv2 = new TV(false, 2, 50);

        System.out.println("TV1 param");
        tv1.GetParam();

        Spaces(1);

        System.out.println("TV2 param");
        tv2.GetParam();

        Spaces(1);

        tv1.numOfChannel = tv2.numOfChannel;
        tv1.GetParam();
    }

    public static void Spaces(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println();
        }
    }

}