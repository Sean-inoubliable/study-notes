package com.sean.sort.other;

/**
 * @SourceVideo  https://space.bilibili.com/406692798
 * @Description: 递归
 * @Author: S.Xinlei
 * @Date: 2019/9/18 0018 9:34
 */
public class Recursion {
    public static void main(String[] args) {
        System.out.println(f(10));
    }

    static long f(int n) {
        if (n < 1) {
            return -1;
        }
        if (n == 1) {
            return 1;
        }
        return n + f(n - 1);
    }
}
