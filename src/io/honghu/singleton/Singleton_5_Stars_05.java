package io.honghu.singleton;

/**
 * 5. 双重锁校验 (线程安全)
 * 双重锁的方式是方法级锁的优化，减少了部分获取实例的耗时。
 */
public class Singleton_5_Stars_05 {

    private static volatile Singleton_5_Stars_05 instance;

    private Singleton_5_Stars_05() {
    }

    public static Singleton_5_Stars_05 getInstance(){
       if(null != instance) {
           return instance;
       }
       synchronized (Singleton_5_Stars_05.class){
           if (null == instance){
               instance = new Singleton_5_Stars_05();
           }
       }
       return instance;
    }
}