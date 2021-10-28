package io.honghu.decorator;

public class Espresso extends Coffee {

    public Espresso() {
        setPrice(6f);
        setDesc(String.format("意大利浓咖啡(%s)", getPrice()));
    }
}
