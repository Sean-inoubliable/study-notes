package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 枚举
 *
 * 不仅可以解决线程同步，还可以防止反序列化
 * Java的反射是可以通过一个.class文件，把整个Class load到内存，然后再把它 new一个实例出来
 * 所以严格来讲，枚举以外的单例都是不安全的
 *
 * 枚举单例不会被反序列化的原因是：枚举类没有构造方法，所以即使拿到.class文件，也没有办法构造其对象
 *
 * @Author: Sean
 * @Date: 2019/9/23 0023 19:21
 */

public class Enumerate {
    public static void main(String[] args) {
        SingletonEnumerate instance = SingletonEnumerate.INSTANCE;
        SingletonEnumerate instance1 = SingletonEnumerate.INSTANCE;
        System.out.println(instance == instance1);
        System.out.println(instance.equals(instance1));
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
        instance.sayOk();
    }
}

enum SingletonEnumerate {

    INSTANCE;
    public void sayOk() {
        System.out.println("ok ~");
    }

}
