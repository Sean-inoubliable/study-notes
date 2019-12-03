package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 懒汉式（线程不安全）
 *
 * lazy loading
 * 达到了按需初始化的目的，但带来了线程不安全的隐患
 *
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

    /* 1. 持有私有静态实例，防止被引用，此处赋值为null，目的是实现延迟加载 */
    private static SingletonLazyUnsafe instance;

    /* 2. 私有构造方法，防止被实例化 */
    private SingletonLazyUnsafe() {}

    /* 3. 静态工程方法，创建实例 */
    public static SingletonLazyUnsafe getInstance() {
        if (instance == null) {
            instance = new SingletonLazyUnsafe();
        }
        return instance;
    }

}
