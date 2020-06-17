package com.songfz.project5;

public class Circle extends Shape {

    private double r;
    private final double PI = 3.14;

    public Circle(double r1) {
        r = r1;
    }

    @Override
    public double area() {
        return PI * r * r;
    }

    @Override
    public double girth() {
        return (double)2 * PI * r;
    }
}
