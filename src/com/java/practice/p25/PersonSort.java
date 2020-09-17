package com.java.practice.p25;

import java.util.Comparator;

public class PersonSort implements Comparator<Person> {
    @Override
    public int compare(Person person, Person t1) {
        if (person.getId() > t1.getId()) return 1;
        else if (person.getId() < t1.getId()) return -1;
        else return 0;
    }
}
