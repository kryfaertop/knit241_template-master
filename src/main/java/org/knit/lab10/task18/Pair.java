package org.knit.lab10.task18;

public class Pair<F, S> {
    private F first; // Первая сущность
    private S second; // Вторая сущность

    // Конструктор
    public Pair(F first, S second) {
        this.first = first;
        this.second = second;
    }

    // Метод для получения первой сущности
    public F getFirst() {
        return first;
    }

    // Метод для получения второй сущности
    public S getSecond() {
        return second;
    }

    // Метод для установки первой сущности
    public void setFirst(F first) {
        this.first = first;
    }

    // Метод для установки второй сущности
    public void setSecond(S second) {
        this.second = second;
    }
}
