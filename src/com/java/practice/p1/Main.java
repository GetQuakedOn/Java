package com.java.practice.p1;

import com.java.practice.p6.*;

public class Main {

    public static void main(String[] args) {

        Client client = new Client("Vasya", 32, "vasya@email.com");
        System.out.println(isPalindrome("1234352"));

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