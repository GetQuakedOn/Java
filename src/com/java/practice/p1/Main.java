package com.java.practice.p1;

import com.java.practice.p18.ScannerException;
import com.java.practice.p19.A;

import java.io.File;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        A a = new A(1);
        A b = new A(1);
        System.out.println(a.equals(b));

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