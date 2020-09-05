package com.java.practice.p19;

public class A {

    private int id;

    public A(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    @Override
    public boolean equals(Object obj) {
        A a = (A)obj;
        return this.id == ((A) obj).id;
    }
}
