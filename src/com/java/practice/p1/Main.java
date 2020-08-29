package com.java.practice.p1;

import java.util.ArrayList;
import java.util.List;
import com.java.practice.p16.*;

public class Main {

    public static void main(String[] args) {

        IAccount<Integer> iacc = new Account(1, "name");
        int x = iacc.getID();

        System.out.println(x);

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