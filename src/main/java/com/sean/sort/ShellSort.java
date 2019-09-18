package com.sean.sort;

/**
 * @SourceVideo: https://space.bilibili.com/406692798
 * @Description: 希尔排序
 * @Author: S.Xinlei
 * @Date: 2019/9/17 0017 15:33
 */
public class ShellSort {

    /* 希尔排序 - 工程中使用率不多
        -> 改进的插入排序
        -> 结合Knuth序列 | 也可结合N/2序列
            -> h = 1
            -> h = 3*h + 1
    */

    /* 不稳 */

    public static void main(String[] args) {
        int[] arr = {9, 6, 11, 3, 5, 12, 8, 7, 10, 15, 14, 4, 1, 13, 2};
        sort(arr);
        SortUtil.print(arr);
    }

    static void sort(int[] arr) {
        int k = 1;
        while (k <= arr.length/3) {
            k = k*3 + 1;
        }
        /* 间隔 k */
        for (int h = k; h > 0; h = (h - 1)/3) {
            for (int i = h; i < arr.length; i++) {
                findMin(arr, i, h);

            }
        }
    }

    static void findMin(int[] arr, int n, int h) {
        for (int j = n; j > h-1 && arr[j] < arr[j-h]; j-=h) {
            SortUtil.swap(arr, j, j-h);
        }
    }

}
