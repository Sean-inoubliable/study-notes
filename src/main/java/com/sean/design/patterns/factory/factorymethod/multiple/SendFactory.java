package com.sean.design.patterns.factory.factorymethod.multiple;

/**
 * @Description: 工厂类
 * @Author: Sean
 * @Date: 2019/9/25 0025 16:57
 */
public class SendFactory {

    public Sender produceMail() {
        return new MailSender();
    }

    public Sender produceSms() {
        return new SmsSender();
    }
}
