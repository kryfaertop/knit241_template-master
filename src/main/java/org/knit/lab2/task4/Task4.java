package org.knit.lab2.task4;

import java.util.Scanner;

public class Task4 {
    public void execute() {
        Container container = new Container();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("1) Сфера\n2) Куб\n3) Цилиндр\n4) Выйти\nВведите номер фигуры: ");
            String chose = scanner.next();


            if (chose.equals("1")) {
                System.out.print("Введите радиус сферы: ");
                int i = scanner.nextInt();
                Sphere sphere = new Sphere(i);
                container.add(sphere);
                System.out.println("Оставшийся объём контейнера: " + container.getcVolume());

            } else if (chose.equals("2")) {
                System.out.print("Введите сторону куба: ");
                int i = scanner.nextInt();
                Cube cube = new Cube(i);
                container.add(cube);
                System.out.println("Оставшийся объём контейнера: " + container.getcVolume());

            } else if (chose.equals("3")) {
                System.out.print("Введите радиус цилиндра: ");
                int i = scanner.nextInt();
                System.out.print("Введите высоту цилиндра: ");
                int j = scanner.nextInt();
                Cylinder cylinder = new Cylinder(i, j);
                container.add(cylinder);
                System.out.println("Оставшийся объём контейнера: " + container.getcVolume());

            } else if (chose.equals("4")) {
                break;
            }
        }
    }
}
