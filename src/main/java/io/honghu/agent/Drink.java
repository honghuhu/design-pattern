package io.honghu.agent;

public interface Drink {

    default void drink() {
        System.out.println("drunk ???");
    }
}
