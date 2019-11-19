package com.sean.design.patterns.adapter.classadapter;

/**
 * @Description:
 * @Author: Sean
 * @Date: 2019/9/27 0027 11:12
 */
public class Phone {

    /* 充电 */
    public void charging(Voltage5V voltage5V) {
        if (voltage5V.outPut5V() == 5) {
            System.out.println(" 电压为 5V，可以充电");
        } else if (voltage5V.outPut5V() > 5){
            System.out.println(" 电压大于 5V，不可充电");
        }
    }
}
