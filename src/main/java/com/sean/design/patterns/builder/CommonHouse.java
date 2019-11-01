package com.sean.design.patterns.builder;

/**
 * @Description: 具体的建造者
 * @Author: Sean
 * @Date: 2019/9/26 0026 16:22
 */
public class CommonHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 普通房子打地基5m");
    }

    @Override
    public void buildWall() {
        System.out.println(" 普通房子砌墙10cm");
    }

    @Override
    public void roofed() {
        System.out.println(" 普通房子屋顶");
    }
}
