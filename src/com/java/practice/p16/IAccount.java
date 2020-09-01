package com.java.practice.p16;

public interface IAccount<T> {

    public T getID();
    public String getName();
    public void setName(String name);

}