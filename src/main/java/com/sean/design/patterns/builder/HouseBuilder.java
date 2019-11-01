package com.sean.design.patterns.builder;

/**
 * @Description: 抽象的建造者
 * @Author: Sean
 * @Date: 2019/9/26 0026 16:19
 */
public abstract class HouseBuilder {

    protected House house = new House();

    /* 将建造的流程写好，抽象的方法 */
    public abstract void buildBasic();
    public abstract void buildWall();
    public abstract void roofed();

    /* 建造房子 */
    public House buildHouse() {
        return house;
    }
}
