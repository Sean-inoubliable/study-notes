package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 饿汉式（静态代码块）
 * @Author: S.Xinlei
 * @Date: 2019/9/21 0021 11:48
 */
public class HungryStaticCodeBlock {

    public static void main(String[] args) {
        SingletonHungryStaticCodeBlock instance = SingletonHungryStaticCodeBlock.getInstance();
        SingletonHungryStaticCodeBlock instance1 = SingletonHungryStaticCodeBlock.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.equals(instance1));
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 饿汉式（静态变量代码块）
 */
class SingletonHungryStaticCodeBlock {

    /* 1. 构造器私有化 */
    private SingletonHungryStaticCodeBlock() { }

    /* 2. 类的内部创建对象 */
    private static final SingletonHungryStaticCodeBlock instance;

    /* 3. 静态代码块中创建单例对象 */
    static { instance = new SingletonHungryStaticCodeBlock(); }

    /* 4. 对外提供一个公有的静态方法，返回对象实例 */
    public static SingletonHungryStaticCodeBlock getInstance() {
        return instance;
    }
}