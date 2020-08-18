package com.java.practice.p1;

import com.java.myClasses.TwoDimensionalArray;
import com.java.practice.p4.TV;
import com.java.practice.p5.*;


public class Main {

    public static void main(String[] args) {

        TwoDimensionalArray a = new TwoDimensionalArray(3,5);
        a.FillArray(10);
        a.ShowArray();
        Space(1);
        TwoDimensionalArray b = new TwoDimensionalArray(a);
        b.ShowArray();
    }

    public static void Space(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println();
        }
    }
}