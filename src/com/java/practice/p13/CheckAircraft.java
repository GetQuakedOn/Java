package com.java.practice.p13;

public class CheckAircraft {

    public static void ShowAmmunition(MilitaryHelicopter militaryHelicopter) {
        militaryHelicopter.ShowAmmunitions();
    }

    public static boolean isVerticalTakeoff(Takeoff takeoff) {
        return takeoff.VerticalTakeoff();
    }

    public static boolean isHorizontalTakeoff(Takeoff takeoff) {
        return takeoff.HorizontalTakeoff();
    }

}
