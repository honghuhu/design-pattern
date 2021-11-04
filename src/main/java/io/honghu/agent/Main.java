package io.honghu.agent;

public class Main {

    public static void main(String[] args) {
        DrinkProxy drinkProxy = new DrinkProxy(new Milk());
        drinkProxy.drink();
    }
}
