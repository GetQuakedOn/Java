package com.java.practice.p1;

import com.java.practice.p6.*;


public class Main {

    public static void main(String[] args) {

        Alex alex = new Alex("Alex", 20);
        alex.ShowInfo();

    }

    public static void Space(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println();
        }
    }
}