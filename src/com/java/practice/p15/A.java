// Anonymous class

package com.java.practice.p15;

public class A {

    public void Method() {
        System.out.println("A's method");
    }

    public static void main(String[] args) {
        A a = new A() {
            @Override
            public void Method() {
                System.out.println("Anon's method");
            }
        };

        a.Method();
    }

}
