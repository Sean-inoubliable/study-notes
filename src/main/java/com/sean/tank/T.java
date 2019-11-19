package com.sean.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Description: 初步认识 Frame类
 * @Author: Sean
 * @Date: 2019/11/19 0019 14:34
 */
public class T {

    public static void main(String[] args) {
        //窗口，new第一次是不会显示出来的
        Frame f = new Frame();
        //设置窗口大小
        f.setSize(1000, 800);
        //设定窗口是否能改变大小
        f.setResizable(false);
        //设置窗口标题
        f.setTitle("坦克大战 - 作者: Sean");
        //将窗口设为可见状态
        f.setVisible(true);

        /* 添加一个 Window的监听器, 监听 windowClosing
           用于窗口关闭
           传入一个匿名内部类 */
        f.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }
}
