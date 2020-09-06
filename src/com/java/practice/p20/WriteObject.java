package com.java.practice.p20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        Person person1 = new Person(1, "Igor");
        Person person2 = new Person(2, "Oleg");

        try {
            FileOutputStream file = new FileOutputStream("data.bin");
            ObjectOutputStream oos = new ObjectOutputStream(file);

            oos.writeObject(person1);
            oos.writeObject(person2);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}