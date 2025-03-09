package org.knit.lab2.task3;

import java.util.Scanner;

public class Task3 {
    public void execute() {
        Calculator calculator = new Calculator();
        while (true) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите число a: ");
            String a = scanner.nextLine();
            if (a.equals("exit")) {
                break;
            }
            double doubleA = Double.parseDouble(a);


            System.out.print("Введите оператор(+, -, *, /): ");
            String op = scanner.nextLine();
            if (op.equals("exit")) {
                break;
            }


            System.out.print("Введите число b: ");
            String b = scanner.nextLine();
            if (b.equals("exit")) {
                break;
            }
            double doubleB = Double.parseDouble(b);



            switch (op) {
                case ("+"): {
                    System.out.println(calculator.add(doubleA, doubleB));
                    break;
                }
                case ("-"): {
                    System.out.println(calculator.subtract(doubleA, doubleB));
                    break;
                }
                case ("*"): {
                    System.out.println(calculator.multiply(doubleA, doubleB));
                    break;
                }
                case ("/"): {
                    if (doubleB==0) {
                        System.out.println("Ошибка: на ноль делить нельзя!");
                        break;
                    }
                    System.out.println(calculator.divide(doubleA, doubleB));
                    break;
                }
            }


        }
    }
}
