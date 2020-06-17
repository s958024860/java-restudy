package com.songfz.project5;

public class Rectangle extends Shape {
    // 长
    private double x;
    // 宽
    private double y;
    public Rectangle(double x1, double y1) {
        x = x1;
        y = y1;
    }

    @Override
    public double area() {
        return (x * y);
    }

    @Override
    public double girth() {
        return (x + y) * 2;
    }
}
