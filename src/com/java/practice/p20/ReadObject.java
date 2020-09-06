package com.java.practice.p20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(file);

            Person[] people = new Person[ois.readInt()];

            for (int i = 0; i < ois.readInt(); i++) {
                people[i] = (Person)ois.readObject();
            }

            for (Person person : people) {
                System.out.println(person);
            }

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
