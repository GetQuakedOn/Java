/**
 *
 * @author NGINX
 * @version 1.0
 *
 */

package com.java.practice.p23;

import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class StartGame {
    private static final int COUNT = 5;
    private static boolean game = true;
    private static int userScore, compScore;
    private static List<Integer> deck;
    private static Scanner in;

    // Run this main ------------------------------------
    public static void main(String[] args) {
        deck = new ArrayList<>();
        in = new Scanner(System.in);
        FillDeck(deck);
        userScore = (int)(Math.random() * COUNT);
        compScore = (int)(Math.random() * COUNT);

        info();
        while (game) {
            move();
        }
        in.close();
    }
    // --------------------------------------------------

    public static void info() {
        System.out.println("\n" + "------------" + " 21 очко " + "------------" + "\n");
    }

    public static void score() {
        System.out.println("--- Ваш счет: " + userScore + "\n" +
                           "--- Счет ИИ: " + compScore);
    }

    public static void move() {
        if (userScore > 21) {
            System.out.println("Вы проиграли.");
            score();
            game = false;
        } else if (compScore > 21) {
            System.out.println("Вы выиграли!");
            score();
            game = false;
        } else {
            System.out.println("Ваш счет: " + userScore);
            System.out.println("1. Взять еще одну" + "\t" + "0. Вскрыться" + "\n");
            int action = in.nextInt();

            switch (action) {
                case 1:
                    int random = (int)(Math.random() * COUNT);
                    userScore += deck.get(random);
                    random = (int)(Math.random() * COUNT);
                    compScore += deck.get(random);
                    break;

                case 0:
                    if (userScore > compScore) {
                        System.out.println("Вы выиграли!");
                        score();
                    } else if (userScore == compScore) {
                        System.out.println("Ничья.");
                        score();
                    } else {
                        System.out.println("Вы проиграли.");
                        score();
                    }
                    game = false;
                    break;

                default:
                    System.out.println("Вы ввели неправильный пункт.");
                    break;
            }
        }
    }

    public static void FillDeck(List<Integer> deck) {
        deck.add(2);
        deck.add(3);
        deck.add(4);
        //deck.add(6);
        //deck.add(7);
        //deck.add(8);
        //deck.add(9);
        deck.add(10);
        deck.add(11);
    }
}
