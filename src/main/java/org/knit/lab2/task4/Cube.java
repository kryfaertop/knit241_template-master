package org.knit.lab2.task4;

public class Cube extends Shape {
    private final double r;

    public Cube(double r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return Math.pow(r, 3);
    }
}