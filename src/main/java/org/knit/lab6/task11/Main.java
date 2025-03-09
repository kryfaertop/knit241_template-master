package org.knit.lab6.task11;

import java.util.Scanner;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        TreeSet<String> fio = new TreeSet<>();
        boolean exit = false;
        while (!exit) {
            System.out.println("\n\nМеню\n1. Добавить студента\n2. Удалить студента\n3. Показать всех студентов\n4. Найти студента\n5. Выйти\n6. Диапазон");
            int integer = scanner.nextInt();
            scanner.nextLine();
            switch (integer) {
                case 1:
                    System.out.println("Введите имя студента: ");
                    String string = scanner.nextLine();
                    boolean check = false;
                    for (String i : fio) {
                        if (i.contains(string)) {
                            System.out.println("Студент уже добавлен.");
                            check = true;
                            break;
                        }
                    }
                    if (!check) {
                        fio.add(string);
                        System.out.println("Студент добавлен.");
                    }
                    break;
                case 2:
                    System.out.println("Введите имя студента для удаления: ");
                    String string2 = scanner.nextLine();
                    boolean check2 = false;
                    for (String i : fio) {
                        if (i.contains(string2)) {
                            check2 = true;
                            fio.remove(i);
                            System.out.println("Студент удален.");
                            break;
                        }
                    }
                    if (!check2) {
                        System.out.println("Студент отсутсвует.");
                    }
                    break;
                case 3:
                    System.out.println("Список студентов: ");
                    for (String i : fio) {
                        System.out.println(i);
                    }
                    break;
                case 4:
                    System.out.println("Введите имя студента для поиска:");
                    String string3 = scanner.nextLine();
                    for (String i : fio) {
                        if (i.contains(string3)) {
                            System.out.println("Студент найден.");
                        }
                    }
                    break;
                case 5:
                    System.out.println("Выходим...");
                    exit = true;
                    break;
                case 6:
                    System.out.println("Введите первого студента из списка:");
                    String startStudent = scanner.nextLine();
                    System.out.println("Введите второго студента из списка:");
                    String endStudent = scanner.nextLine();

                    System.out.println("Список студентов в заданном диапазоне:");
                    try {
                        for (String student : fio.subSet(startStudent, true, endStudent, true)) {
                            System.out.println(student);
                        }
                    } catch (IllegalArgumentException e) {
                        System.out.println("Ошибка: неверный диапазон.");
                    }
                    break;
            }

        }
    }
}
