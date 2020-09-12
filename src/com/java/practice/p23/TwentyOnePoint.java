/**
 *
 * @author NGINX
 * @version 1.2
 *
 */

package com.java.practice.p23;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TwentyOnePoint {
    private static final int COUNT = 5;
    private static boolean inGame = true;
    private static int userScore, compScore;
    private static List<Integer> deck;
    private static List<String> suits;
    private static Scanner in;

    // Run this main ------------------------------------
    public static void main(String[] args) {
        deck = new LinkedList<>();
        suits = new LinkedList<>();
        in = new Scanner(System.in);
        FillDeck(deck);
        FillSuits(suits);
        userScore = deck.get((int)(Math.random() * COUNT));
        compScore = deck.get((int)(Math.random() * COUNT));

        info();
        while (inGame) {
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
            inGame = false;
        } else if (compScore > 21) {
            System.out.println("Вы выиграли!");
            score();
            inGame = false;
        } else {
            System.out.println("Ваш счет: " + userScore);
            System.out.println("1. Взять еще одну" + "\t" + "0. Вскрыться" + "\n");
            int action = in.nextInt();

            switch (action) {
                case 1:
                    int random = (int)(Math.random() * COUNT);
                    userScore += deck.get(random);
                    System.out.println("Вы взяли карту: " + suits.get(random));
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
                    inGame = false;
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

    public static void FillSuits(List<String> suits) {
        suits.add("Валет");
        suits.add("Дама");
        suits.add("Король");
        suits.add("Десятка");
        suits.add("Туз");
    }
}