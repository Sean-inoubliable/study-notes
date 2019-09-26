package com.sean.design.patterns.singleton;

/**
 * @Description: 设计模式 - 单例模式 - 枚举
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
