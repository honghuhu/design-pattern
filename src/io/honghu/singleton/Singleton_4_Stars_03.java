package io.honghu.singleton;

/**
 * 3. 饿汉模式 (线程安全)
 * 此种方式与我们开头的第一个实例化Map基本一致，在程序启动的时候直接运行加载，后续有外部需要使用的时候获取即可。
 * 但此种方式并不是懒加载，也就是说无论你程序中是否用到这样的类都会在程序启动之初进行创建。
 */
public class Singleton_4_Stars_03 {

    private static final Singleton_4_Stars_03 instance = new Singleton_4_Stars_03();

    private Singleton_4_Stars_03() {
    }

    public static Singleton_4_Stars_03 getInstance() {
        return instance;
    }
}