package com.sean.sort;

/**
 * @SourceVideo  https://space.bilibili.com/406692798
 * @Description: 选择排序
 * @Author: S.Xinlei
 * @Date: 2019/9/17 0017 10:56
 */
public class InsertionSort {

    /*
    简单排序最重要的一种
    对于基本有序的数组最好用
    稳定

    类比 : 抓扑克牌

    TODO:  优化, 修改算法(用临时变量记录标记项, 去掉swap方法)
    */

    public static void main(String[] args) {
        int[] arr = {9, 6, 1, 3, 5};
        sort(arr);
    }

    static void sort(int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            System.out.println("外层循环第 " + i + " 次");
            findMin(arr, i);

        }
    }

    static void findMin(int[] arr, int n) {
        for (int j = n; j > 0 && arr[j] < arr[j-1]; j--) {
                SortUtil.swap(arr, j, j-1);
        }
        SortUtil.print(arr);
        System.out.println();
    }
}
