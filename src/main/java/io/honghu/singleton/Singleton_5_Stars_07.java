package io.honghu.singleton;

/**
 * 7. Effective Java 作者推荐的枚举单例 (线程安全)
 * 约书亚 · 布洛克（英语：Joshua J. Bloch，1961 年 8 月 28 日－），美国著名程序员。他为 Java 平台设计并实作了许多的功能，曾担任 Google 的首席 Java 架构师（Chief Java Architect）。
 * Effective Java 作者推荐使用枚举的方式解决单例模式，此种方式可能是平时最少用到的。
 * 这种方式解决了最主要的；线程安全、自由串行化、单一实例。
 */
public enum Singleton_5_Stars_07 {
    // 单例对象
    INSTANCE;

    public void method01() {
    }

    public static void main(String[] args) {
        /*
         * 这种写法在功能上与共有域方法相近，但是它更简洁，无偿地提供了串行化机制，绝对防止对此实例化，即使是在面对复杂的串行化或者反射攻击的时候。虽然这中方法还没有广泛采用，但是单元素的枚举类型已经成为实现 Singleton 的最佳方法。
         * 但也要知道此种方式在存在继承场景下是不可用的。
         */
        System.out.println(Singleton_5_Stars_07.INSTANCE.toString());
    }
}