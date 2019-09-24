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

    /* 1. 构造器私有化操作 */
    private SingletonLazySafeSynMethod() {}

    /* 2. 类的内部创建对象 */
    private static SingletonLazySafeSynMethod instance;

    /* 3. 提供一个静态的共有方法，加入了同步代码块，解决线程不安全问题 */
    public static synchronized SingletonLazySafeSynMethod getInstance() {
        if (instance == null) { instance = new SingletonLazySafeSynMethod(); }
        return instance;
    }

}
