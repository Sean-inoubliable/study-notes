package com.sean.design.patterns.prototype.deepcopy;

/**
 * @Description:
 * @Author: Sean
 * @Date: 2019/9/26 0026 12:22
 */
public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        DeepProtoType deepProtoType = new DeepProtoType();
        deepProtoType.name = "Sean-inoubliable";
        deepProtoType.deepCloneableTarget = new DeepCloneableTarget("joker","sean");

        /* 方式 1：深拷贝 */
        DeepProtoType deepProtoType1 = (DeepProtoType) deepProtoType.clone();
        System.out.println(deepProtoType.name + "-----------" + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType1.name + "-----------" + deepProtoType1.deepCloneableTarget.hashCode());

        /* 方式 2：深拷贝 */
        DeepProtoType deepProtoType2 = (DeepProtoType) deepProtoType.deepClone();
        System.out.println(deepProtoType.name + "-----------" + deepProtoType.deepCloneableTarget.hashCode());
        System.out.println(deepProtoType2.name + "-----------" + deepProtoType2.deepCloneableTarget.hashCode());
    }
}
