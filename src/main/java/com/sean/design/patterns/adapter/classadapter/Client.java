package com.sean.design.patterns.adapter.classadapter;

/**
 * @Description:
 * @Author: Sean
 * @Date: 2019/9/27 0027 11:14
 */
public class Client {
    public static void main(String[] args) {
        System.out.println(" 类的适配器模式");
        Phone phone = new Phone();
        phone.charging(new VoltageAdapter());
    }
}
