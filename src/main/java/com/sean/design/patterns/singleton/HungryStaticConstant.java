package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 饿汉式（静态常量）
 *          1) 构造器私有化（防止 new）
 *          2) 类的内部创建对象，注意关键字 private static final
 *          3) 向外暴露一个静态的公共方法（getInstance)
 *
 * 类加载到内存后，就是实例化一个单例，JVM保证线程安全
 * 简单实用，推荐使用！
 * 唯一缺点：不管用到与否，类加载时就完成实例化
 *
 * @Author: S.Xinlei
 * @Date: 2019/9/21 0021 11:04
 */
public class HungryStaticConstant {

    public static void main(String[] args) {
        SingletonHungryStaticConstant instance = SingletonHungryStaticConstant.getInstance();
        SingletonHungryStaticConstant instance1 = SingletonHungryStaticConstant.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.equals(instance1));
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 饿汉式（静态变量）
 */
class SingletonHungryStaticConstant {

    /* 1. 构造器私有化 */
    private SingletonHungryStaticConstant() {}

    /* 2. 类的内部创建对象 */
    private final static SingletonHungryStaticConstant instance = new SingletonHungryStaticConstant();

    /* 3. 对外提供一个公有的静态方法，返回对象实例 */
    public static SingletonHungryStaticConstant getInstance() {
        return instance;
    }
}
