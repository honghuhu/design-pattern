package io.honghu.strategy.improve;

public class WildDuck extends Duck {

    public WildDuck() {
        super(new GoodFlyBehavior());
    }

    @Override
    public void display() {
        System.out.printf("我是野鸭 --- ");
    }
}
