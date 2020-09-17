package com.java.practice.p25;

import java.util.*;

public class Sort {
    public static void main(String[] args) {
//        List<String> names = new ArrayList<>();
//        names.add("Nikolas");
//        names.add("Mike");
//        names.add("Robert");
//        names.add("Eugene");
//        names.add("Bob");
//
//        Collections.sort(names, new StringLengthComparator());
//        System.out.println(names);

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
    }
}