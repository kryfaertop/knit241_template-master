package org.knit.lab6.task10;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static final int MAX = 6;

    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        List<String> words = getWords("src/main/resources/dictionary.txt");
        String wordToGuess = words.get(random.nextInt(words.size()));
        List<Character> guessedWord = new ArrayList<>();
        Set<Character> guessedLetters = new HashSet<>();
        int attemptsLeft = MAX;

        for (int i = 0; i < wordToGuess.length(); i++) {
            guessedWord.add('_');
        }

        System.out.println("Добро пожаловать в игру 'Виселица'!");

        while (attemptsLeft > 0 && guessedWord.contains('_')) {
            System.out.println("Текущее слово: " + displayWord(guessedWord));
            System.out.print("Введите букву: ");
            char guessedLetter = scanner.nextLine().toLowerCase().charAt(0);

            if (guessedLetters.contains(guessedLetter)) {
                System.out.println("Вы уже вводили эту букву. Попробуйте другую.");
                continue;
            }

            guessedLetters.add(guessedLetter);

            if (wordToGuess.contains(String.valueOf(guessedLetter))) {
                System.out.println("Верно!");
                for (int i = 0; i < wordToGuess.length(); i++) {
                    if (wordToGuess.charAt(i) == guessedLetter) {
                        guessedWord.set(i, guessedLetter);
                    }
                }
            } else {
                attemptsLeft--;
                System.out.println("Неверно! Осталось попыток: " + attemptsLeft);
            }
        }

        if (!guessedWord.contains('_')) {
            System.out.println("Поздравляем! Вы угадали слово: " + wordToGuess);
        } else {
            System.out.println("Вы проиграли! Загаданное слово было: " + wordToGuess);
        }
        scanner.close();
    }

    private static String displayWord(List<Character> guessedWord) {
        StringBuilder display = new StringBuilder();
        for (Character c : guessedWord) {
            display.append(c).append(" ");
        }
        return display.toString().trim();
    }
    public static List<String> getWords(String path) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(path));
        List<String> words = new ArrayList<>();
        while (scanner.hasNextLine()) {
            words.add(scanner.nextLine());
        }
        scanner.close();
        return words;
    }
}

