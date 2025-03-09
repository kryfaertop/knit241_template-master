package org.knit.lab8;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        System.out.println("Добро пожаловать в систему управления пользователями!");
        List<User> onLoad = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;
        while (!exit) {
            System.out.println("\n\nВыберите действие:\n1. Добавить нового пользователя\n2. Удалить пользователя\n3. Показать всех пользователей\n4. Сохранить список пользователей в файл\n5. Загрузить список пользователей из файла\n6. Выйти");
            int integer = scanner.nextInt();
            scanner.nextLine();
            switch (integer) {
                case 1:
                    System.out.println("Введите имя пользователя: ");
                    String name = scanner.nextLine();
                    System.out.println("Введите возраст: ");
                    int age = scanner.nextInt();
                    scanner.nextLine();
                    System.out.println("Введите email: ");
                    String email = scanner.nextLine();
                    User user = new User(name, age, email);
                    boolean check = false;
                    for (User i : onLoad) {
                        if (i.equals(user)) {
                            System.out.println("Пользователь уже добавлен.");
                            check = true;
                            break;
                        }
                    }
                    if (!check) {
                        onLoad.add(user);
                        System.out.println("Пользователь добавлен.");
                    }
                    break;
                case 2:
                    System.out.println("Введите имя пользователя для удаления: ");
                    String name2 = scanner.nextLine();
                    boolean check2 = false;
                    for (User i : onLoad) {
                        if (i.getName().equals(name2)) {
                            check2 = true;
                            onLoad.remove(i);
                            System.out.println("Пользователь удален.");
                            break;
                        }
                    }
                    if (!check2) {
                        System.out.println("Пользователь отсутсвует.");
                    }
                    break;
                case 3:
                    System.out.println("Список пользователей: ");
                    for (User i : onLoad) {
                        System.out.println(i.toString());
                    }
                    break;
                case 4:
                    UserManager.saveUsers(onLoad);
                    System.out.println("Список успешно сохранён в файл.");
                    break;
                case 5:
                    System.out.println("Вы уверены? Текущий список пользователь будет удален(yes/no)");
                    if (scanner.nextLine().equals("yes")) {
                        onLoad = UserManager.loadUsers("user.ser");
                        System.out.println("Список успешно загружен из файла.");
                    }
                    break;
                case 6:
                    System.out.println("Выходим...");
                    exit = true;
                    break;


            }
        }
    }
}

