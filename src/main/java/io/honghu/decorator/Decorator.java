package io.honghu.decorator;

/**
 * 装饰者, 用来计算金额&展示用料信息
 */
public class Decorator extends Drink {

    private Drink drink;

    public Decorator(Drink drink) {
        this.drink = drink;
    }

    @Override
    public float cost() {
        return drink.cost() + super.getPrice();
    }

    @Override
    public String getDesc() {
        return drink.getDesc() + " + " + super.getDesc();
    }
}
