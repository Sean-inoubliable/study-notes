package com.sean.design.patterns.prototype.shallowcopy;

/**
 * @Description: 原型模式 - 原型类
 * @Author: Sean
 * @Date: 2019/9/26 0026 11:01
 */
public class Sheep implements Cloneable {
    private String name;
    private Integer age;
    private String color;

    public Sheep(String name, int age, String color) {
        super();
        this.name = name;
        this.age = age;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Sheep{");
        sb.append("name='").append(name).append('\'');
        sb.append(", age=").append(age);
        sb.append(", color='").append(color).append('\'');
        sb.append('}');
        return sb.toString();
    }

    /**
     * @Description: （浅拷贝）克隆该实例，使用默认的clone方法来完成。不对原有属性进行处理
     * @Author: Sean
     * @Date:   2019/9/26 0026 11:14
     */
    @Override
    protected Object clone() {
        Sheep sheep = null;
        try {
            sheep = (Sheep)super.clone();
        } catch ( Exception e ){
            System.out.println(e.getMessage());
        }

        return sheep;
    }
}
