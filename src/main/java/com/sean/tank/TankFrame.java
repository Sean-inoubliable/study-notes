package com.sean.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * @Description: 继承 Frame类
 * @Author: Sean
 * @Date: 2019/11/19 0019 15:02
 */
public class TankFrame extends Frame {
    /* 从 Frame类继承，并且重写 paint方法，画出一个黑方块 */

    //构造方法
    public TankFrame() {
        //设置窗口大小
        setSize(1000, 700);
        //设定窗口是否能改变大小
        setResizable(false);
        //设置窗口标题
        setTitle("坦克大战 - 作者: Sean");
        //将窗口设为可见状态
        setVisible(true);

        /* 添加一个 Window的监听器, 监听 windowClosing
           用于窗口关闭
           传入一个匿名内部类 */
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        });
    }

    /* paint(Graphics graphics)窗口需要重新绘制的时候，将被系统自动调用
       Graphics可当做是一支画笔 */
    @Override
    public void paint(Graphics graphics) {
        //坐标 x，坐标 y，宽，长
        graphics.fillRect(200, 200, 50, 50);
    }
}
