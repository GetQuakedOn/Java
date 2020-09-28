package com.java.practice.p26;

import com.java.practice.p1.Main;

import java.util.LinkedList;
import java.util.Queue;

public class Person {
    private int id;

    public Person(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person{" +
                "id=" + id +
                '}';
    }

    public static void main(String[] args) {
        Person person1 = new Person(1);
        Person person2 = new Person(2);
        Person person3 = new Person(3);
        Person person4 = new Person(4);

        Queue<Person> queue = new LinkedList<>();
        queue.add(person3);
        queue.add(person2);
        queue.add(person4);
        queue.add(person1);

        Main.Space(1);

        for (Person human : queue) {
            System.out.println(human.toString());
        }
    }
}
