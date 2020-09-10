package com.java.practice.p21;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MeasureTime {

    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        List<Integer> linkList = new LinkedList<>();

        measureTime(arrayList);
        measureTime(linkList);
    }

    public static void measureTime(List<Integer> list) {
        long start = System.currentTimeMillis();

        for (int i = 0; i < 1000000; i++) {
            list.add(i);
        }

        long end = System.currentTimeMillis();
        System.out.println(end - start);
    }

}
