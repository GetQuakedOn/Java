package com.java.myClasses;

import java.lang.Math;

public class TwoDimensionalArray {

    private int ROW, COL;
    private int arr[][];

    public TwoDimensionalArray(final int ROW, final int COL) {
        this.ROW = ROW;
        this.COL = COL;

        arr = new int[ROW][COL];
    }

    //C-C
    public TwoDimensionalArray(TwoDimensionalArray TDA) {
        this.ROW = TDA.ROW;
        this.COL = TDA.COL;

        this.arr = new int[this.ROW][this.COL];

        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                arr[i][j] = TDA.arr[i][j];
            }
        }
    }

    public void FillArray(final int value) {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                arr[i][j] = (int)(Math.random() * value);
            }
        }
    }

    public void ShowArray() {
        for (int i = 0; i < ROW; i++) {
            for (int j = 0; j < COL; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
