package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 懒汉式（线程不安全）
 * @Author: S.Xinlei
 * @Date: 2019/9/23 0023 18:01
 */
public class LazyUnsafe {
    public static void main(String[] args) {
        SingletonLazyUnsafe instance = SingletonLazyUnsafe.getInstance();
        SingletonLazyUnsafe instance1 = SingletonLazyUnsafe.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.equals(instance1));
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class SingletonLazyUnsafe {

    /* 1. 构造器私有化操作 */
    private SingletonLazyUnsafe() {}

    /* 2. 类的内部创建对象 */
    private static SingletonLazyUnsafe instance;

    /* 3. 提供一个静态的共有方法，当使用该方法时，再去创建 instance */
    public static SingletonLazyUnsafe getInstance() {
        if (instance == null) { instance = new SingletonLazyUnsafe(); }
        return instance;
    }

}
