package com.java.practice.p20;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {

    public static void main(String[] args) {
        try {
            FileInputStream file = new FileInputStream("data.bin");
            ObjectInputStream ois = new ObjectInputStream(file);

            Person person1 = (Person)ois.readObject();
            Person person2 = (Person)ois.readObject();
            System.out.println(person1);
            System.out.println(person2);

            ois.close();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }

}
