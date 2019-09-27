package com.sean.design.patterns.factory.factorymethod.staticfactory;

/**
 * @Description: 发送 Sms 实现类
 * @Author: Sean
 * @Date: 2019/9/25 0025 16:55
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println(" this is sms sender!");
    }
}
