package com.songfz.project4;

public class Test {

    public static void main(String[] args) {
//        Animal animal = new Animal();
//        Animal dog = new Dog(); // 父类的引用可以指向子类的对象  多态

//        Animal dog = new Dog();
//        Animal dog2 = new Animal();
//        Animal cat = new Cat();
//        dog.eat();
//        dog2.eat();
//        cat.eat();

        // 类型转换
        Animal animal = new Animal();
        Dog dog = new Dog();
        Animal animal1 = dog; // 自动类型转换
        if (animal instanceof Dog) {
            Dog dog1 = (Dog) animal; // 强制类型转换
        } else {
            System.out.println("无法进行类型转换");
        }
    }
}
