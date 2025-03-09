package org.knit.lab2.task4;

public class Cylinder extends Shape {
    private final double r;
    private final double h;

    public Cylinder(double r, double h) {
        this.r = r;
        this.h = h;
    }

    @Override
    public double getVolume() {
        return Math.PI * Math.pow(r, 2) * h;
    }
}
