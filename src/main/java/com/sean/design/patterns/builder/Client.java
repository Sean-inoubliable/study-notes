package com.sean.design.patterns.builder;

/**
 * @Description:
 * @Author: Sean
 * @Date: 2019/9/26 0026 16:40
 */
public class Client {
    public static void main(String[] args) {

        /**
         * 普通房子
         */
        CommonHouse commonHouse = new CommonHouse();
        // 准备创建房子的指挥者
        HouseDirector houseDirector = new HouseDirector(commonHouse);
        // 完成盖房子，返回产品
        House house = houseDirector.constructHouse();

        /**
         * 高楼
         */
        HighHouse highHouse = new HighHouse();
        houseDirector.setHouseBuilder(highHouse);
        House house1 = houseDirector.constructHouse();
    }
}
