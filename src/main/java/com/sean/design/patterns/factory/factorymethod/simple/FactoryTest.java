package com.sean.design.patterns.factory.factorymethod.simple;

/**
 * @Description: 普通工厂模式测试类
 * @Author: Sean
 * @Date: 2019/9/25 0025 17:00
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produce("mail");
        sender.Send();
    }
}
