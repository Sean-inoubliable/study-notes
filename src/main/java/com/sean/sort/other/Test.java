package com.sean.sort.other;

import java.util.ArrayList;

/**
 * @Description:
 * @Author: S.Xinlei
 * @Date: 2019/9/23 0023 15:05
 */
public class Test {

    public static void main(String[] args) {
        Thread t = new Thread();

        System.out.println(t.getState());

        try {
            t.wait(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        System.out.println(t.getState());
    }
}