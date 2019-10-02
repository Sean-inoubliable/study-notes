package com.sean.design.patterns.factory.abstractfactory;

/**
 * @Description: sms 实现类
 * @Author: Sean
 * @Date: 2019/9/25 0025 17:54
 */
public class SmsSender implements Sender {
    public void send() {
        System.out.println(" this is sms Sender");
    }
}
