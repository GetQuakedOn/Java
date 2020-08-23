package com.java.practice.p10;

public class Client extends Person {

    private int sum;

    public Client(String name, int sum) {
        super(name);
        this.sum = sum;
    }

    public int getSum() {
        return sum;
    }

    public void setSum(int sum) {
        this.sum = sum;
    }

    @Override
    public void Display() {
        System.out.println(super.getName());
        System.out.println(sum);
    }
}
