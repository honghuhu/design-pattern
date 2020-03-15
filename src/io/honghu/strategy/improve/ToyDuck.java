package io.honghu.strategy.improve;

public class ToyDuck extends Duck {

    public ToyDuck() {
        super(new NoFlyBehavior());
    }

    @Override
    public void display() {
        System.out.printf("我是玩具鸭 --- ");
    }
}
