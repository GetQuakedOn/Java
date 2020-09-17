package com.java.practice.p25;

import com.java.practice.p1.Main;

import java.util.*;

public class Sort {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();
        nums.add(3);
        nums.add(45);
        nums.add(722);
        nums.add(54);
        nums.add(82);

        Collections.sort(nums, new Comparator<Integer>() {
            @Override
            public int compare(Integer integer, Integer t1) {
                if (integer < t1) return 1;
                else if (integer > t1) return -1;
                else return 0;
            }
        });

        System.out.println(nums);
        Main.Space(2);

        List<Person> human = new ArrayList<>();
        human.add(new Person(3));
        human.add(new Person(1));
        human.add(new Person(6));
        human.add(new Person(4));

        Collections.sort(human, new PersonSort());
        System.out.println(human);
    }
}