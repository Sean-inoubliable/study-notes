package com.sean.design.patterns.builder;

/**
 * @Description: 指挥者
 *      动态的去指定制作流程，返回具体的产品
 * @Author: Sean
 * @Date: 2019/9/26 0026 16:36
 */
public class HouseDirector {

    HouseBuilder houseBuilder = null;

    /* 构造器传入 houseBuilder */
    public HouseDirector(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /* 通过setter 传入 houseBuilder */
    public void setHouseBuilder(HouseBuilder houseBuilder) {
        this.houseBuilder = houseBuilder;
    }

    /* 如何处理建造房子的流程，交给指挥者 */
    public House constructHouse() {
        houseBuilder.buildBasic();
        houseBuilder.buildWall();
        houseBuilder.roofed();
        return houseBuilder.buildHouse();
    }
}
