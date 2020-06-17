package com.songfz.project5;

public class Test {

    public static void main(String[] args) {
        double x = 2.3;
        double y = 3.4;
        double r = 5.2;
        Shape rect = new Rectangle(x, y);
        Shape circle = new Circle(r);

        System.out.println("长方形的面积: " + rect.area());
        System.out.println("长方形的周长: " + rect.girth());
        System.out.println("圆的面积: " + circle.area());
        System.out.println("圆的周长: " + circle.girth());
    }
}
