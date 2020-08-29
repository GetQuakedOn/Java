package com.java.practice.p16;

public class Account implements IAccount {

    private Integer id;
    private String name;

    public Account(Integer id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public Integer getID() {
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