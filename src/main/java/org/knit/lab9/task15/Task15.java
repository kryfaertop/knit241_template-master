package org.knit.lab9.task15;

public class Task15 {
    public static void main(String[] args) {
        for (Season season : Season.values()) {
            System.out.println(season.name() + ": " + season.getTemperature() + ", типичный праздник - " + season.getHoliday());
        }
    }
}

