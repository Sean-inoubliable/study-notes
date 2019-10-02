package com.sean.design.patterns.factory.abstractfactory;

/**
 * @Description: 工厂类
 * @Author: Sean
 * @Date: 2019/9/25 0025 17:57
 */
public class SendSmsFactory implements Provider {
    public Sender produce() {
        return new SmsSender();
    }
}
