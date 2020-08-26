package com.java.practice.p1;

import com.java.practice.p13.*;

public class Main {

    public static void main(String[] args) {

        Mi24 mi24 = new Mi24();
        CheckAircraft.ShowAmmunition(mi24);

    }

    public static void Space(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println();
        }
    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse().toString());
    }
}