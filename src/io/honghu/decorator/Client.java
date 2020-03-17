package io.honghu.decorator;

public class Client {

    public static void main(String[] args) {
        Drink drink = new Decaf();
        System.out.println(drink.getDesc() + " = " + drink.getPrice());

        drink = new Milk(drink);
        System.out.println(drink.getDesc() + " = " + drink.cost());

        drink = new Sugar(drink);
        System.out.println(drink.getDesc() + " = " + drink.cost());

        drink = new Chocolate(drink);
        System.out.println(drink.getDesc() + " = " + drink.cost());

//        控制台结果
//        无因咖啡(1.0) = 1.0
//        无因咖啡(1.0) + 牛奶(2.0) = 3.0
//        无因咖啡(1.0) + 牛奶(2.0) + 糖(0.5) = 3.5
//        无因咖啡(1.0) + 牛奶(2.0) + 糖(0.5) + 巧克力(3.0) = 6.5
    }
}
