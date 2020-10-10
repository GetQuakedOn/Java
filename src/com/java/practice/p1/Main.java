package com.java.practice.p1;

import com.java.practice.p28.MT;
import com.java.practice.p28.Runner;

public class Main {

    public static void main(String[] args) {
//        MT mt = new MT();
//        mt.start();
//
//        MT mt2 = new MT();
//        mt2.start();

        Thread thread = new Thread(new Runner());
        thread.start();

        Thread thread2 = new Thread(new Runner());
        thread2.start();
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