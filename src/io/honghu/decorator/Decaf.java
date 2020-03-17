package io.honghu.decorator;

public class Decaf extends Coffee {

    public Decaf() {
        setPrice(1f);
        setDesc(String.format("无因咖啡(%s)", getPrice()));
    }
}
