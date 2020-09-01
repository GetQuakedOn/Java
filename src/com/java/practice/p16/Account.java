package com.java.practice.p16;

public class Account<T> implements IAccount<T>{
    private T id;
    private String name;

    public Account(T id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public T getID() {
        return id;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }
}