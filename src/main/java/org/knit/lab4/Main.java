package org.knit.lab4;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Arrays;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        List<String> wordsList= new ArrayList<>();
        char[] alphabet = "абвгдежзийклмнопрстуфхцчшщъыьэюя".toCharArray();
        try {
            Scanner scanner = new Scanner(new File("src/main/resources/dictionary.txt"));
            while (scanner.hasNextLine()) {
                String word = scanner.nextLine();
                wordsList.add(word);
            }
            scanner.close();
        } catch (FileNotFoundException e) {
            System.err.println("Файл не найден: " + e.getMessage());
        }
        String[] wordsArray = wordsList.toArray(new String[0]);
        //DictionaryStatistic dictionaryStatistic = new DictionaryStatistic(wordsArray, alphabet);
        //dictionaryStatistic.printSymbolsStat();
        //System.out.println(dictionaryStatistic.getRandomWord());
       // System.out.println(dictionaryStatistic.getWords("библиотека"));



    }
}



