package com.sean.design.patterns.prototype.shallowcopy;

/**
 * @Description: 客户类，让一个原型对象克隆自己，从而创建一个新的对象（属性一样）
 * @Author: Sean
 * @Date: 2019/9/26 0026 11:18
 */
public class Client {
    public static void main(String[] args) {

        System.out.println(" 原型模式完成对象的创建");
        Sheep sheep = new Sheep("tom", 1, "白色");
        /* 克隆 */
        Sheep sheep2 = (Sheep)sheep.clone();
        Sheep sheep3 = (Sheep)sheep.clone();
        Sheep sheep4 = (Sheep)sheep.clone();
        Sheep sheep5 = (Sheep)sheep.clone();

        System.out.println("sheep = " + sheep + " ，HashCode()为：" +sheep.hashCode());
        System.out.println("sheep2 = " + sheep2 + " ，HashCode()为：" +sheep2.hashCode());
        System.out.println("sheep3 = " + sheep3 + " ，HashCode()为：" +sheep3.hashCode());
        System.out.println("sheep4 = " + sheep4 + " ，HashCode()为：" +sheep4.hashCode());
        System.out.println("sheep5 = " + sheep5 + " ，HashCode()为：" +sheep5.hashCode());
    }
}
