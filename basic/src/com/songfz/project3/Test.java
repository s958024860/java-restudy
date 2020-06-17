package com.songfz.project3;

public class Test {

    public static void main(String[] args) {
        int newAge = 18;
        Dog dog = new Dog(newAge);
        System.out.println(dog.toString());
        dog.method();
    }
}
