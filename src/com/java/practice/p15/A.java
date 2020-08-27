// Anonymous class

package com.java.practice.p15;

public class A implements C {

    public void Method() {
        System.out.println("A's method");
    }

    @Override
    public void OtherMethod() {
        System.out.println("A's other method");
    }

    public static void main(String[] args) {
        C c = new C() {
            @Override
            public void OtherMethod() {
                System.out.println("Anonymous method");
            }
        };

        c.OtherMethod();
    }

}
