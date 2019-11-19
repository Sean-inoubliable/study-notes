package com.sean.design.patterns.adapter.classadapter;

/**
 * @Description: 被适配者
 * @Author: Sean
 * @Date: 2019/9/27 0027 11:06
 */
public class Voltage220V {

    /* 输出 220V 电压 */
    public int outPut220V(){
        int src = 220;
        System.out.println(" 电压 = " + src + "伏");
        return src;
    }
}
