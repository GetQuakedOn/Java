package com.java.practice.p20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class ReadObject {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(file);

            Person[] people = (Person[])ois.readObject();
            System.out.println(Arrays.toString(people));

            ois.close();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
