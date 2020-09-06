package com.java.practice.p20;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {

    public static void main(String[] args) {
        Person[] people = {new Person(1, "Alex"),
                           new Person(2, "Oleg"),
                           new Person(3, "Igor")};

        try {
            FileOutputStream file = new FileOutputStream("data.bin");
            ObjectOutputStream oos = new ObjectOutputStream(file);

            oos.writeObject(people);

            oos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
