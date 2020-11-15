package com.java.practice.p27;

import java.util.Arrays;
import java.util.Scanner;

public class PrizeWinners {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int humans = in.nextInt();
        int winersCount = in.nextInt();
        int random = (int)((Math.random() * humans) + 1);;
        int[] winers = new int[winersCount];

        for (int i = 0; i < winers.length; i++) {
            if (!isRepeat(winers, random)) {
                winers[i] = random;
            } else {
                i--;
                random = (int)((Math.random() * humans) + 1);
            }

            random = (int)((Math.random() * humans) + 1);
        }

        Arrays.sort(winers);
        System.out.println(Arrays.toString(winers));
    }

    public static boolean isRepeat(int[] array, int count) {
        boolean bool = false;
        for (int i : array) bool |= (i == count);
        return bool;
    }
}
