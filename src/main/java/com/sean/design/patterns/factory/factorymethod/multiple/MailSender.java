package com.sean.design.patterns.factory.factorymethod.multiple;

/**
 * @Description: 发送 Mail 实现类
 * @Author: Sean
 * @Date: 2019/9/25 0025 16:54
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println(" this is mail sender!");
    }
}
