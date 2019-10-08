package com.sean.design.patterns.prototype.deepcopy;

import java.io.Serializable;

/**
 * @Description: 深拷贝
 * @Author: Sean
 * @Date: 2019/9/26 0026 12:09
 */
public class DeepCloneableTarget implements Serializable, Cloneable {

    private static final long serialVersionUID = 1L;

    private String cloneName;

    private String cloneClass;

    /* 构造器 */
    public DeepCloneableTarget(String cloneName, String cloneClass) {
        this.cloneName = cloneName;
        this.cloneClass = cloneClass;
    }

    /**
     * 默认的clone()方法会对基本数据类型和字符串进行拷贝
     * 因为该类的属性都是String，因此我们这里使用默认的clone()方法完成即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
