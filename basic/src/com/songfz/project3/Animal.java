package com.songfz.project3;

public class Animal {

    public int age = 10;
    public String name;

    public void eat() {
        System.out.println("动物具有吃东西的能力");
    }
//
//    public Animal() {
//        System.out.println("Animal 类执行了");
//    }

    public Animal(int newAge) {
        age = newAge;
        System.out.println("Animal 类执行了");
    }

}
