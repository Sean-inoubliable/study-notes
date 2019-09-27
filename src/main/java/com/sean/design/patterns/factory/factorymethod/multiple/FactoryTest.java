package com.sean.design.patterns.factory.factorymethod.multiple;

/**
 * @Description: 多个工厂模式测试类
 * @Author: Sean
 * @Date: 2019/9/25 0025 17:00
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendFactory sendFactory = new SendFactory();
        Sender sender = sendFactory.produceMail();
        sender.send();
    }
}
