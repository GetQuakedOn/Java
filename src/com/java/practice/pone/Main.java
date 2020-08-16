package com.java.practice.pone;

import com.java.practice.pfour.TV;
import com.java.practice.ptwo.Bus;
import java.lang.Math;
import java.util.Scanner;
import com.java.myClasses.TwoDimensionalArray;

public class Main {

    public static void main(String[] args) {

    TwoDimensionalArray arr = new TwoDimensionalArray(3, 5);

//    arr.FillArray(100);
//    arr.ShowArray();

    int Mass[][] = new int[3][5];

    for (int i = 0; i < 3; i++) {              // заполнение
        for (int j = 0; j < 5; j++) {
            Mass[i][j] = (int)(Math.random() * 10);
        }
    }

        for (int i = 0; i < 3; i++) {          // вывод
            for (int j = 0; j < 5; j++) {
                System.out.print(Mass[i][j] + "\t");
            }
            System.out.println();
        }

    Spaces(2);

        /*for (int i[]: Mass) {
            for (int j : i) {
                System.out.println(i);
            }
        }*/

    }

    public static void Spaces(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println();
        }
    }
}