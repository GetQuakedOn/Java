package com.java.practice.p1;

import com.java.myClasses.TwoDimensionalArray;
import com.java.practice.p15.C;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        TwoDimensionalArray td = new TwoDimensionalArray(-3, 5);
        td.FillArray(10);
        td.ShowArray();

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