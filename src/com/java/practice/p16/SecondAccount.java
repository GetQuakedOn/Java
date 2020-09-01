package com.java.practice.p16;

public class SecondAccount<T, S> extends Account<T> {

    private S surname;

    public SecondAccount(T id, String name, S surname) {
        super(id, name);
        this.surname = surname;
    }

    public S getSurname() {
        return surname;
    }

    public void setSurname(S surname) {
        this.surname = surname;
    }

}
