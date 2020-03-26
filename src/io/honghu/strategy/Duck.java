package io.honghu.strategy;

public abstract class Duck {

    private FlyBehavior flyBehavior;

    /**
     * 提供修改飞翔策略的方法
     */
    public void setFlyBehavior(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    public Duck(FlyBehavior flyBehavior) {
        this.flyBehavior = flyBehavior;
    }

    /**
     * 展示基本信息
     */
    public abstract void display();

    public void fly() {
        this.display();
        flyBehavior.fly();
    }
}
