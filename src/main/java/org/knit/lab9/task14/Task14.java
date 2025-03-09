package org.knit.lab9.task14;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите текущий сигнал светофора (RED, YELLOW, GREEN): ");
        String input = scanner.nextLine().toUpperCase();

        TrafficLight trafficLight = TrafficLight.valueOf(input);
        TrafficLight nextLight = trafficLight.getNextLight(trafficLight);
        System.out.println(nextLight);
        scanner.close();
    }
}
