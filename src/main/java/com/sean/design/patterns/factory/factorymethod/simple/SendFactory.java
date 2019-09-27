package com.sean.design.patterns.factory.factorymethod.simple;

/**
 * @Description: 发送工厂类
 * @Author: Sean
 * @Date: 2019/9/25 0025 16:57
 */
public class SendFactory {

    public Sender produce(String type) {
        do {
            if ("mail".equals(type)) {
                return new MailSender();
            } else if ("sms".equals(type)) {
                return new SmsSender();
            } else {
                System.out.println(" 请输入正确类型！");
                return null;
            }
        } while (true);
    }
}
