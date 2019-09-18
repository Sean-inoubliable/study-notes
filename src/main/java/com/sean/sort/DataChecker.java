package com.sean.sort;

import java.util.Arrays;
import java.util.Random;

/**
 * @SourceVideo  https://space.bilibili.com/406692798
 * @Description  随机样本产生器 + 对数器 ( 验证算法 )
 * @Author  S.Xinlei
 * @CreateDate: 2019/9/16 0016 15:35
 */
public class DataChecker {

    /* 验证算法 - 对数器 */
    /*
    如何验证你的算法是否正确
        1. 肉眼观察不可靠
        2. 产生足够多随机样本
        3. 用确定正确的算法计算样本结果
        4. 对比被验证算法的结果
     */

    /**
     * @Description: 产生足够多的随机样本
     * ( 包含随机数的长度为10000的数组 )
     * @param
     * @return  int[]
     * @Author  Sean·S
     * @Date    2019/9/16 0016 15:36
     */
    static int[] generateRandomArray() {
        /* 随机数产生器 */
        Random r = new Random();
        /* 长度10000的数组 */
        int[] arr = new int[10000];
        /* 数组中赋值10000以内的随机数 */
        for (int i = 0; i < arr.length; i++) {
            arr[i] = r.nextInt(10000);
        }
        return arr;
    }
    
    /**
     * @Description
     * @param
     * @return  void
     * @Author  S.Xinlei
     * @Date    2019/9/16 0016 16:22
     */
    static void check() {
        /* 单次生成的数组一定要 Copy 一份儿 */
        int[] arr = generateRandomArray();
        int[] arrCopy = new int[arr.length];
        System.arraycopy(arr, 0, arrCopy, 0, arr.length);

        /* 使用系统算法 & 自己的算法 */
        Arrays.sort(arr);
        //SelectionSort.sort(arrCopy);
        //BubbleSort.sort(arrCopy);
        //InsertionSort.sort(arrCopy);
        //ShellSort.sort(arrCopy);
        //MergeSort.sort(arrCopy, 0 , arrCopy.length - 1);

        /* 将两个数组进行比较, 验证算法是否存在问题 */
        boolean same = true;
        for (int i = 0; i < arrCopy.length; i++) {
            if (arr[i] != arrCopy[i]) { same = false; }
        }
        System.out.println(same == true ? "right" : "wrong");

    }

    public static void main(String[] args) {
        /* 大批量数据验证算法 */
        check();
    }
}
