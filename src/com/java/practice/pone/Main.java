package com.java.practice.pone;

import com.java.practice.pfour.TV;
import com.java.practice.ptwo.Bus;
import java.lang.Math;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        System.out.println("In");
        //int x = in.nextInt();
        if (in.hasNextInt()) {
            int x = in.nextInt();
            System.out.println(x);
        } else {
            System.out.println("Fck off");
        }

        //

        in.close();

        int y = in.nextInt();
        System.out.println(y);

        //

        /*int array[] = {1, 2, 3, 4, 5};

        for (int element: array) {
            System.out.print(element + "\t");
        }

        Scanner in = new Scanner();

        Spaces(2);

        final int ROW = 3, COL = 5;

        int arr[][] = new int[ROW][COL];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                arr[i][j] = (int) (Math.random() * 10);
            }
        }

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            Spaces(1);
        }*/

    }

    public static void Spaces(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println();
        }
    }
}