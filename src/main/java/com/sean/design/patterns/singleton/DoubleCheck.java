package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 双重检查（锁对象）
 * @Author: Sean
 * @Date: 2019/9/23 0023 18:41
 */
public class DoubleCheck {
    public static void main(String[] args) {
        SingletonDoubleCheck instance = SingletonDoubleCheck.getInstance();
        SingletonDoubleCheck instance1 = SingletonDoubleCheck.getInstance();
        System.out.println(instance == instance1);
        System.out.println(instance.equals(instance1));
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}

class SingletonDoubleCheck {

    /**
     *  volatile关键字，可以将修改之立即更新到主存，可理解为轻量级的同步锁
     *
     *  volatile保证了线程间的可见性，和一定程度上的顺序性（不能保证原子性）
     *  更好的方式是用一个boolean变量表示对象是否创建过（原子性）
     */
    private static volatile SingletonDoubleCheck instance;

    private SingletonDoubleCheck(){}

    public static SingletonDoubleCheck getInstance() {
        if (instance == null) {
            synchronized (SingletonDoubleCheck.class) {
                if (instance == null) {
                    instance = new SingletonDoubleCheck();
                }
            }
        }
        return instance;
    }
}
