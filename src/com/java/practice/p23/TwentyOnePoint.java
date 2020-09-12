/**
 *
 * @author NGINX
 * @version 1.4
 *
 */

package com.java.practice.p23;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class TwentyOnePoint {
    private static final int COUNT = 5;
    private static boolean inGame = true;
    private static boolean restartGame = true;
    private static int userScore, compScore;
    private static int quantityCard;
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

        while (restartGame) {
            userScore = deck.get((int) (Math.random() * COUNT));
            compScore = deck.get((int) (Math.random() * COUNT));
            quantityCard = 0;

            info();
            while (inGame) {
                move();
            }
            isRestartGame();
        }
    }
    // --------------------------------------------------

    public static void info() {
        clearLog();
        System.out.println("\n" + "------------" + " 21 очко " + "------------" + "\n");
        pause(250);
    }

    public static void score() {
        System.out.println("--- Ваш счет: " + userScore + "\n" +
                           "--- Счет ИИ: " + compScore);
    }

    public static void checkScore() {
        if (userScore > compScore && compScore <= 21) {
            System.out.println("\nВы выиграли!");
            score();
        } else if (userScore < compScore && compScore <= 21){
            System.out.println("\nВы проиграли.");
            score();
        } else if (userScore == compScore) {
            System.out.println("\nНичья.");
            score();
        } else if (userScore > 21 && compScore > 21) {
            System.out.println("\nНичья.");
            score();
        } else {
            System.out.println("\nВы выиграли!");
            score();
        }
    }

    public static void isRestartGame() {
        System.out.println("\nНачать заново?" + "\t" + "1 / 0");
        int answer = in.nextInt();
        inGame = restartGame = (answer == 1);
    }

    public static void pause(int time) {
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void clearLog() {
        for (int i = 0; i < 10; i++) {
            System.out.println();
        }
    }

    public static void move() {
        quantityCard++;

        if (userScore > 21 && compScore <= 21) {
            System.out.println("Вы проиграли.");
            score();
            inGame = false;
        } else if (userScore > 21 && compScore > 21) {
            System.out.println("Ничья.");
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
                    quantityCard++;
                    int random = (int)(Math.random() * COUNT);
                    userScore += deck.get(random);
                    System.out.println("Вы взяли карту: " + suits.get(random));

                    if (compScore < 18) {
                        random = (int)(Math.random() * COUNT);
                        compScore += deck.get(random);
                    }
                    break;

                case 0:
                    if (quantityCard != 1) {
                        while (compScore < 18) {
                            random = (int) (Math.random() * COUNT);
                            compScore += deck.get(random);
                            System.err.println("Компьютер берет еще одну карту...");
                            pause(500);
                        }
                    }

                    if (quantityCard == 1) {
                        while (compScore < 11) {
                            random = (int) (Math.random() * COUNT);
                            compScore += deck.get(random);
                            System.err.println("Компьютер берет еще одну карту...");
                            pause(500);
                        }
                    }

                    checkScore();
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
        deck.add(10);
        deck.add(11);

//        Uncomment this 'for' with next line and comment lines (116 - 120)
//        if you want to play with 9 suits

//        for (int i = 2; i <= 11; i++) {
//            deck.add(i);
//        }
//        deck.remove(3);
    }

    public static void FillSuits(List<String> suits) {
        suits.add("Валет");
        suits.add("Дама");
        suits.add("Король");
//        suits.add("Шестерка");  //and this items
//        suits.add("Семерка");   //!Don't forget about COUNT! (change to 9)
//        suits.add("Восьмерка");
//        suits.add("Девятка");
        suits.add("Десятка");
        suits.add("Туз");
    }
}