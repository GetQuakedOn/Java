package com.java.practice.p1;

import com.java.practice.p13.Aircraft;
import com.java.practice.p13.Boeing737;
import com.java.practice.p13.CheckTakeoff;
import com.java.practice.p13.Mi24;

public class Main {

    public static void main(String[] args) {

        //

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