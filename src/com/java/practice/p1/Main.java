package com.java.practice.p1;

import com.java.practice.p4.TV;
import com.java.practice.p5.*;


public class Main {

    public static void main(String[] args) {

        TV tv = new TV(1,  2);
        TV tv2 = new TV(2, 5);

        System.out.println(TV.getID());

        Space(2);

        Status status = Status.OFF;
        Status status2 = Status.valueOf(Status.class, "SLEEP");

        tv.setStatus(status);
        tv2.setStatus(status2);

        for (Status value: Status.values()) {
            System.out.print(value + "\t");
        }
        Space(1);

        Speed speed = Speed.valueOf(Speed.class, "RECOMMEND");
        //System.out.println(speed.ordinal());
        System.out.println(speed.getSpeed());

    }

    public static void Space(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println();
        }
    }
}