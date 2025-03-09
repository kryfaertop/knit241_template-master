package org.knit.lab2.task4;

import java.util.ArrayList;

public class Container {
    private double cVolume = 1000;
    public ArrayList<Shape> figure = new ArrayList<>();

    public double getcVolume() {
        return cVolume;
    }

    public void add(Shape shape) {
        if (shape.getVolume() <= cVolume) {
            cVolume -= shape.getVolume();
            figure.add(shape);
        } else {
            System.out.println("Недостаточно места для добавления фигуры.");
        }
    }
}

