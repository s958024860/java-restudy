package com.songfz.project3;

import java.util.Objects;

public class Dog extends Animal {

    public int age = 20;

    public void eat() {
        System.out.println("狗具有吃骨头的能力");
    }

    public Dog(int newAge) {
        super(newAge);
        System.out.println("狗类执行了");
    }

    public void method() {
        System.out.println("animal的年龄：" + super.age);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age;
    }

    @Override
    public int hashCode() {
        return Objects.hash(age);
    }
}
