package io.honghu.strategy;

public class PekingDuck extends Duck {

    public PekingDuck() {
        super(new BadFlyBehavior());
    }

    @Override
    public void display() {
        System.out.printf("我是北京鸭 --- ");
    }
}
