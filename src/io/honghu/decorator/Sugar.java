package io.honghu.decorator;

public class Sugar extends Decorator {

    public Sugar(Drink drink) {
        super(drink);
        setPrice(0.5f);
        setDesc(String.format("糖(%s)", getPrice()));
    }
}
