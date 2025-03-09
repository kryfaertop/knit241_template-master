package org.knit.lab2.task4;

public class Sphere extends Shape {
    private final double r;

    public Sphere(int r) {
        this.r = r;
    }

    @Override
    public double getVolume() {
        return (double) 4 / 3 * Math.PI * Math.pow(r, 3);
    }
}
