package io.honghu.singleton;

import java.util.concurrent.atomic.AtomicReference;

/**
 * 6. CAS「AtomicReference」(线程安全)
 * java 并发库提供了很多原子类来支持并发访问的数据安全性；AtomicInteger、AtomicBoolean、AtomicLong、AtomicReference。
 * AtomicReference 可以封装引用一个 V 实例，支持并发访问如上的单例方式就是使用了这样的一个特点。
 * 使用 CAS 的好处就是不需要使用传统的加锁方式保证线程安全，而是依赖于 CAS 的忙等算法，依赖于底层硬件的实现，来保证线程安全。相对于其他锁的实现没有线程的切换和阻塞也就没有了额外的开销，并且可以支持较大的并发性。
 * 当然 CAS 也有一个缺点就是忙等，如果一直没有获取到将会处于死循环中。
 */
public class Singleton_3_Stars_06 {

    private static final AtomicReference<Singleton_3_Stars_06> INSTANCE = new AtomicReference<>();

    private Singleton_3_Stars_06() {
    }

    public static Singleton_3_Stars_06 getInstance() {
        while (true) {
            Singleton_3_Stars_06 instance = INSTANCE.get();
            if (null != instance) {
                return instance;
            }
            INSTANCE.compareAndSet(null, new Singleton_3_Stars_06());
            return INSTANCE.get();
        }
    }

    public static void main(String[] args) {
        System.out.println(Singleton_3_Stars_06.getInstance());
        // io.honghu.singleton.Singleton_3_Stars_06@61bbe9ba
        System.out.println(Singleton_3_Stars_06.getInstance());
        // io.honghu.singleton.Singleton_3_Stars_06@61bbe9ba
    }

}