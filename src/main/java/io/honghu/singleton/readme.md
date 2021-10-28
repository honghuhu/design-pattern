## 单例模式
### 核心思想

> 单例模式（Singleton Pattern）是 Java 中最简单的设计模式之一。这种类型的设计模式属于创建型模式，它提供了一种创建对象的最佳方式。
这种模式涉及到一个单一的类，该类负责创建自己的对象，同时确保只有单个对象被创建。这个类提供了一种访问其唯一的对象的方式，可以直接访问，不需要实例化该类的对象。

注意：
1. 单例类只能有一个实例。
2. 单例类必须自己创建自己的唯一实例。
3. 单例类必须给所有其他对象提供这一实例。

### 代码写法
0. [静态类使用](Singleton_4_Stars_00.java)
1. [懒汉模式 (线程不安全)](Singleton_0_Stars_01.java)
1. [懒汉模式 (线程安全)](Singleton_2_Stars_02.java)
1. [饿汉模式 (线程安全)](Singleton_4_Stars_03.java)
1. [使用类的内部类 (线程安全)](Singleton_5_Stars_04.java)
1. [双重锁校验 (线程安全)](Singleton_5_Stars_05.java)
1. [CAS「AtomicReference」(线程安全)](Singleton_3_Stars_06.java)
1. [Effective Java 作者推荐的枚举单例 (线程安全)](Singleton_5_Stars_07.java)
1. [多渠道单例配置类(实战)](Singleton_5_Stars_05_AiConfig.java)