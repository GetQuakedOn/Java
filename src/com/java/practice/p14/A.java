package com.java.practice.p14;

import java.util.ArrayList;
import java.util.List;

public class A {

    private int id;

    public A() {
    }

    public A(int id) {
        this.id = id;
    }

    public String toString() {
        return String.valueOf(id);
    }

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

}
