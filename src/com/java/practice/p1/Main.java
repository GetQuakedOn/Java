package com.java.practice.p1;

import com.java.practice.p10.Client;
import com.java.practice.p10.Employee;
import com.java.practice.p10.Person;
import com.java.practice.p6.*;
import com.java.practice.p8.Human;
import com.java.practice.p8.MountainBicycle;
import com.java.practice.p8.SimpleBicycle;
import com.java.practice.p9.Machine;
import com.java.practice.p9.Pistol;
import com.java.practice.p10.*;
import com.java.practice.p9.Weapon;

public class Main {

    public static void main(String[] args) {

        /*Employee employee = new Employee("Oleg Dibrov", 51, "Farmer");
        employee.ShowInfo();
        Space(2);
        Client client = new Client("Aleksandr Fedorov", 36, 60_000);
        client.ShowInfo();
        Space(4);

        SimpleBicycle sb = new SimpleBicycle("BMX");;
        Human human1 = new Human(sb);
        human1.TwistPedals();
        human1.Steer();
        Space(2);
        MountainBicycle mb = new MountainBicycle("MaxxPro");
        Human human2 = new Human(mb);
        human2.TwistPedals();
        human2.Steer();
        Space(4);

        Machine america = new Machine("M16", 5.56f);
        //america.Use();
        Pistol pm = new Pistol("Makarov", 9.18f);
        //pm.Use();
        Space(1);
        Human soldier = new Human(america);
        System.out.println(soldier.getCaliber());*/

        Weapon weapon = new Machine("M16", 5.45f);
        System.out.println(((Machine)weapon).getCaliber());

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