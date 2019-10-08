package com.sean.design.patterns.prototype.deepcopy;

import java.io.*;

/**
 * @Description: 原型类型
 * @Author: Sean
 * @Date: 2019/9/26 0026 12:13
 */
public class DeepProtoType implements Serializable, Cloneable {

    /* 基本数据类型 + 引用类型 */

    public String name; //String属性
    public DeepCloneableTarget deepCloneableTarget; //引用类型
    public DeepProtoType() {
        super();
    }

    /**
     * 深拷贝方式 1：使用clone()方法
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        Object deep = null;
        /* 这里完成对基本数据类型（属性）和字符串的克隆 */
        deep = super.clone();
        /* 对引用类型的属性，进行单独的处理 */
        DeepProtoType deepProtoType = (DeepProtoType)deep;
        deepProtoType.deepCloneableTarget = (DeepCloneableTarget) deepCloneableTarget.clone();
        return deepProtoType;
    }

    /**
     * 深拷贝方式 2：通过对象的序列化来实现深拷贝（推荐使用）
     */
    public Object deepClone() {
        /**
         * 因为整个处理的过程，需要用到序列化
         * 所以要先定义 并且 创建一些流对象（输出流 & 输入流）
         * 定义
         */
        ByteArrayOutputStream bos = null;
        ObjectOutputStream oos = null;
        ByteArrayInputStream bis = null;
        ObjectInputStream ois = null;

        try {
            /* 序列化 创建 */
            bos = new ByteArrayOutputStream();
            oos = new ObjectOutputStream(bos);

            /* 将当前这个对象以对象流的方式输出 - 序列化 */
            oos.writeObject(this);

            /* 反序列化 */
            bis = new ByteArrayInputStream(bos.toByteArray());
            ois = new ObjectInputStream(bis);

            DeepProtoType copyObj = (DeepProtoType) ois.readObject();

            return copyObj;
        } catch ( Exception e ){
            e.printStackTrace();
            return null;
        } finally {
            /* 关闭流 */
            try {
                bos.close();
                oos.close();
                bis.close();
                ois.close();
            } catch ( Exception e ){
                System.out.println(e.getMessage());
            }
        }
    }
}
