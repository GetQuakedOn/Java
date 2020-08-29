package com.java.practice.p15;

public class B extends A {

    public B() {
        System.out.println(super.hashCode());
        System.out.println(this.hashCode());
    }

    @Override
    public void Method() {
        System.out.println("B's method");
        System.out.println(this.hashCode());
    }
}
