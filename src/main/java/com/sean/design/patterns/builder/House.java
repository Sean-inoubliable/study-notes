package com.sean.design.patterns.builder;

/**
 * @Description: 产品角色
 * @Author: Sean
 * @Date: 2019/9/26 0026 16:17
 */
public class House {
    private String basic;
    private String wall;
    private String roofed;

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("House{");
        sb.append("basic='").append(basic).append('\'');
        sb.append(", wall='").append(wall).append('\'');
        sb.append(", roofed='").append(roofed).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public String getBasic() {
        return basic;
    }

    public void setBasic(String basic) {
        this.basic = basic;
    }

    public String getWall() {
        return wall;
    }

    public void setWall(String wall) {
        this.wall = wall;
    }

    public String getRoofed() {
        return roofed;
    }

    public void setRoofed(String roofed) {
        this.roofed = roofed;
    }
}
