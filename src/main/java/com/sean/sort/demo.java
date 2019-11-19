package com.sean.sort;

/**
 * @Description:
 * @Author: S.Xinlei
 * @Date: 2019/9/18 0018 11:24
 */
public class demo {
    public static void main(String[] args) {
        A ab = new B();
        ab = new B();
    }
}

class A {
    static {System.out.print("1");}

    public A() {
        System.out.println("2");
    }
}

class B extends A {
    static {
        System.out.println("a");
    }

    public B() {
        System.out.println("b");
    }
}
