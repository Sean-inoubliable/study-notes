package com.sean.design.patterns.factory.abstractfactory;

/**
 * @Description: mail 实现类
 * @Author: Sean
 * @Date: 2019/9/25 0025 17:53
 */
public class MailSender implements Sender {
    public void send() {
        System.out.println(" this is mailSender!");
    }
}
