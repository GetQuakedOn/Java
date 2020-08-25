package com.java.practice.p1;

import com.java.practice.p12.*;
import com.java.practice.p10.*;

public class Main {

    public static void main(String[] args) {

        Dog dog = new Dog();
        //dog.woof();
        Animal animal = new Animal();
        animal = dog;

        if (animal instanceof Dog) {
            Dog dog2 = new Dog();
            dog2 = (Dog)animal;
            //dog2.woof();
        }
        else {
            //System.out.println("Not instance");
        }

        Space(2);

        //

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