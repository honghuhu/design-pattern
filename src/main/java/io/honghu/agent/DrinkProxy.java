package io.honghu.agent;

public class DrinkProxy implements Drink {

    private final Drink drink;

    public DrinkProxy(Drink drink) {
        this.drink = drink;
    }

    @Override
    public void drink() {
        System.out.println("before drink");
        drink.drink();
        System.out.println("after drink");
    }
}
