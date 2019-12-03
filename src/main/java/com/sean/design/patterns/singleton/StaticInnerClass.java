package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 静态内部类（JVM类装载机制）
 *
 * JVM 保证单例
 * 加载外部类时不会加载内部类，这样可以实现懒加载
 *
 * @Author: Sean
 * @Date: 2019/9/23 0023 18:59
 */
public class StaticInnerClass {
    public static void main(String[] args) {
        SingletonStaticInnerClass instance = SingletonStaticInnerClass.getInstance();
        SingletonStaticInnerClass instance1 = SingletonStaticInnerClass.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.equals(instance1));
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

/**
 * 1. 外部类装在的时候，静态内部类并不会立即被装载
 * 2. 在调用getInstance()方法时，会致使静态内部类的装载，而且只会装载一次
 * 3. JVM在装载类时，线程是安全的
 */
class SingletonStaticInnerClass {

    private SingletonStaticInnerClass() {}

    /**
     * 静态内部类，该类中有一个静态属性
     */
    private static class SingletonStaticInnerClassInstance {
        private static final SingletonStaticInnerClass INSTANCE = new SingletonStaticInnerClass();
    }

    public static SingletonStaticInnerClass getInstance() {
        return SingletonStaticInnerClassInstance.INSTANCE;
    }
}
