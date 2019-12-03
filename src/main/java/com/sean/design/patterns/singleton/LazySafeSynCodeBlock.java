package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 懒汉式（伪线程安全，同步代码块）
 * @Author: S.Xinlei
 * @Date: 2019/9/23 0023 18:01
 */
public class LazySafeSynCodeBlock {
    public static void main(String[] args) {
        SingletonLazySafeSynCodeBlock instance = SingletonLazySafeSynCodeBlock.getInstance();
        SingletonLazySafeSynCodeBlock instance1 = SingletonLazySafeSynCodeBlock.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.equals(instance1));
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class SingletonLazySafeSynCodeBlock {

    /* 1. 构造器私有化操作 */
    private SingletonLazySafeSynCodeBlock() {}

    /* 2. 类的内部创建对象 */
    private static SingletonLazySafeSynCodeBlock instance;

    /* 3. 提供一个静态的共有方法，加入了同步代码块，解决线程不安全问题 */
    public static SingletonLazySafeSynCodeBlock getInstance() {
        if (instance == null) {
            /* 妄图通过减小同步代码块的方式提高效率。结论：不可行 */
            synchronized (SingletonLazySafeSynCodeBlock.class) {
                instance = new SingletonLazySafeSynCodeBlock();
            }
        }
        return instance;
    }
}
