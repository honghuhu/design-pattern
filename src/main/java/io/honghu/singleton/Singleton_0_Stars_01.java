package io.honghu.singleton;

/**
 * 1. 懒汉模式 (线程不安全)
 */
public class Singleton_0_Stars_01 {

    private static Singleton_0_Stars_01 instance;

    private Singleton_0_Stars_01() {
    }

    public static Singleton_0_Stars_01 getInstance() {
        if (null != instance) {
            return instance;
        }
        instance = new Singleton_0_Stars_01();
        return instance;
    }
}