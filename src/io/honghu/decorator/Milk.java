package io.honghu.decorator;

public class Milk extends Decorator {

    public Milk(Drink drink) {
        super(drink);
        setPrice(2f);
        setDesc(String.format("牛奶(%s)", getPrice()));
    }
}
