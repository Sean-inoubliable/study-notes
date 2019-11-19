package com.sean.tank;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
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

        /* 内部类 */
        this.addKeyListener(new MyKeyListener());

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

    int x = 200, y=200;

    /* paint(Graphics graphics)窗口需要重新绘制的时候，将被系统自动调用
       Graphics可当做是一支画笔 */
    @Override
    public void paint(Graphics graphics) {
        //坐标 x，坐标 y，宽，长
        graphics.fillRect(x, y, 50, 50);
    }

    /* 键盘监听处理类，处理键盘事件 */
    class MyKeyListener extends KeyAdapter {

        //会在一个键按下的时候被调用
        @Override
        public void keyPressed(KeyEvent e) {
            System.out.println("key pressed!");
        }
        //会在一个键抬起的时候被嗲用
        @Override
        public void keyReleased(KeyEvent e) {
            System.out.println("key released！");
        }
    }
}
