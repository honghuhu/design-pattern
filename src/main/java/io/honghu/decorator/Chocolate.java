package io.honghu.decorator;

public class Chocolate extends Decorator {

    public Chocolate(Drink drink) {
        super(drink);
        setPrice(3f);
        setDesc(String.format("巧克力(%s)", getPrice()));
    }
}
