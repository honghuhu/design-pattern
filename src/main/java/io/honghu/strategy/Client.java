package io.honghu.strategy;

import java.util.Arrays;
import java.util.Comparator;

public class Client {
    public static void main(String[] args) {
        Duck duck = new PekingDuck();
        duck.fly();
        System.out.println("说错了");
        duck.setFlyBehavior(new NoFlyBehavior());
        duck.fly();
        duck = new WildDuck();
        duck.fly();
        duck = new ToyDuck();
        duck.fly();

//        控制台结果
//        我是北京鸭 --- 飞翔技术一般...
//        说错了
//        我是北京鸭 --- 不会飞翔...
//        我是野鸭 --- 飞翔技术高超...
//        我是玩具鸭 --- 不会飞翔...
    }
}
/**
 * 策略模式在 JDK-Arrays 应用的源码分析
 */
class Strategy {
    public static void main(String[] args) {
        Integer[] array = {100, 20, 13, 40, 15};
        /**
         * 给数组排序, 实现策略接口 Comparator
         * 实现升序排列: 返回 -1 放左边, 1 放右边, 0 保持不变
         */
        Comparator<Integer> comparator = (t1, t2) -> t1 > t2 ? 1 : -1;
        Arrays.sort(array, comparator);
        System.out.println(Arrays.toString(array));
    }
}
