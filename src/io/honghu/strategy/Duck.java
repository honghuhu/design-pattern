package io.honghu.strategy;

public abstract class Duck {

    public abstract void display();

    public void quack() {
        System.out.println("鸭子嘎嘎叫...");
    }

    public void swim() {
        System.out.println("鸭子会游泳...");
    }

    public void fly() {
        System.out.println("鸭子会飞...");
    }
}
