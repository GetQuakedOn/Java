package com.java.practice.p1;

import com.java.practice.p18.ScannerException;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws ScannerException {

        Scanner in = new Scanner(System.in);

        while (true) {
            int x = in.nextInt();

            if (x == 0) {
                throw new ScannerException("Scanner error!");
            }
        }

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