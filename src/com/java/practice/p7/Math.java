package com.java.practice.p7;

public class Math {

    public static class Factorial {

        private int num;

        public Factorial(int num) {
            this.num = num;
        }

        public int getNum() {
            return num;
        }

    }

    public static class TwoDimensionalArray {

        private int ROW;
        private int COL;
        private int arr[][];

        public TwoDimensionalArray(int ROW, int COL) {
            this.ROW = ROW;
            this.COL = COL;

            arr = new int[ROW][COL];
        }

        public void FillArray(int max) {
            for (int i = 0; i < ROW; i++) {
                for (int j = 0; j < COL; j++) {
                    arr[i][j] = (int)(java.lang.Math.random() * max);
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

    public static Factorial getFactorial(int num) {
        int result = 1;

        for (int i = 1; i <= num; i++) {
            result *= i;
        }

        return new Factorial(result);
    }

    public static TwoDimensionalArray getTDA(int ROW, int COL) {
        return new TwoDimensionalArray(ROW, COL);
    }

}
