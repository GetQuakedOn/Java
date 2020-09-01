package com.java.practice.p17;

import com.java.practice.p6.Person;

public class A implements Cloneable {

    private int id;

    public A(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public A clone() throws CloneNotSupportedException {
        return (A) super.clone();
    }

    public static void main(String[] args) {
        try {
            A a = new A(1);
            A b = a.clone();
            b.setId(2);
            System.out.println(a.getId());
        }
        catch (CloneNotSupportedException ex) {
            System.out.println("Clonable not implemented");
        }
    }
}
