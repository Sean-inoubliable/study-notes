package com.sean.design.patterns.adapter.classadapter;

/**
 * @Description: 适配器类
 * @Author: Sean
 * @Date: 2019/9/27 0027 11:09
 */
public class VoltageAdapter extends Voltage220V implements Voltage5V {
    public int outPut5V() {

        /* 获取到 220V 电压 */
        int srcV = outPut220V();
        int dstV = srcV / 44;
        return dstV;
    }
}
