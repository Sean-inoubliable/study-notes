package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 懒汉式（线程安全，同步方法）
 * @Author: S.Xinlei
 * @Date: 2019/9/23 0023 18:01
 */
public class LazySafeSynMethod {
    public static void main(String[] args) {
        SingletonLazySafeSynMethod instance = SingletonLazySafeSynMethod.getInstance();
        SingletonLazySafeSynMethod instance1 = SingletonLazySafeSynMethod.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.equals(instance1));
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class SingletonLazySafeSynMethod {

    /* 1. 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonLazySafeSynMethod instance;

    /* 2. 私有构造方法，防止被实例化 */
    private SingletonLazySafeSynMethod() {}

    /* 3. 静态工程方法，创建实例 */
    /**
     * synchronized关键字锁住的是这个对象，
     * 这样的用法，在性能上会有所下降，
     * 因为每次调用getInstance()，都要对对象上锁。
     * 事实上，只有在第一次创建对象的时候需要上锁，之后就不需要了
     */
    public static synchronized SingletonLazySafeSynMethod getInstance() {
        if (instance == null) { instance = new SingletonLazySafeSynMethod(); }
        return instance;
    }

}
