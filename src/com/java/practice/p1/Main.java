package com.java.practice.p1;

import com.java.practice.p7.Math;


public class Main {

    public static void main(String[] args) {

        Math.TwoDimensionalArray arr = Math.getTDA(3, 5);
        arr.FillArray(10);
        arr.ShowArray();

    }

    public static void Space(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println();
        }
    }
}