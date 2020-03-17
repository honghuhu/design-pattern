package io.honghu.decorator;

/**
 * 咖啡馆
 */
public class Coffee extends Drink {

    @Override
    public float cost() {
        return super.getPrice();
    }
}
