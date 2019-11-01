package com.sean.design.patterns.builder;

/**
 * @Description: 具体的建造者
 * @Author: Sean
 * @Date: 2019/9/26 0026 16:34
 */
public class HighHouse extends HouseBuilder {
    @Override
    public void buildBasic() {
        System.out.println(" 高楼打地基100m");
    }

    @Override
    public void buildWall() {
        System.out.println(" 高楼砌墙20cm");
    }

    @Override
    public void roofed() {
        System.out.println(" 高楼屋顶");
    }
}
