package com.java.practice.p1;

import java.util.*;
import com.java.practice.p24.Person;

public class Main {

    public static void main(String[] args) {

        Person p1 = new Person(1, "Ale1x");
        Person p2 = new Person(1, "Alex");
        Set<Person> set = new HashSet<>();

        set.add(p1);
        set.add(p2);

        System.out.println(set);

    }

    public static void Space(int value) {
        for (int i = 0; i < value; i++) {
            System.out.println();
        }
    }

    public static boolean isPalindrome(String text) {
        return text.replaceAll("\\W","")
                .equalsIgnoreCase(new StringBuilder(text.replaceAll("\\W",""))
                        .reverse().toString());
    }
}