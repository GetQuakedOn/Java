package com.java.practice.p1;

import com.java.practice.p14.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        List<A> listA = new ArrayList<>();

        listA.add(new A(1));
        listA.add(new A(2));

        List<B> listB = new ArrayList<>();
        listB.add(new B());
        listB.add(new B());

        Test(listB);
    }

    private static void Test(List<? extends B> listAny) {
        for (A a : listAny) {
            System.out.println(a.toString());
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