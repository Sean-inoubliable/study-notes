package com.sean.design.patterns.factory.factorymethod.staticfactory;

/**
 * @Description: 工厂类
 * @Author: Sean
 * @Date: 2019/9/25 0025 16:57
 */
public class SendFactory {

    public static Sender produceMail() {
        return new MailSender();
    }

    public static Sender produceSms() {
        return new SmsSender();
    }
}
