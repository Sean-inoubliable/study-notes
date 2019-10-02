package com.sean.design.patterns.factory.abstractfactory;

/**
 * @Description: 测试类
 * @Author: Sean
 * @Date: 2019/9/25 0025 17:58
 */
public class FactoryTest {

    public static void main(String[] args) {
        SendMailFactory sendMailFactory = new SendMailFactory();
        Sender sender = sendMailFactory.produce();
        sender.send();
    }
}
