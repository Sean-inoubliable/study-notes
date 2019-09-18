package com.sean.sort;

/**
 * @SourceVideo: https://space.bilibili.com/406692798
 * @Description: 冒泡排序
 * @Author: S.Xinlei
 * @Date: 2019/9/16 0016 17:46
 */
public class BubbleSort {

    /**
     *  假如你觉得一个程序可能会非常复杂的时候,
     *  将其一些比较固定的功能分解到一些方法里, 方法名要起的有意义
     *  再去调用这些方法, 这样程序看起来非常清爽
     *
     *  时间复杂度
     *
     *  空间复杂度
     */

    /* TODO: 优化, ... ... */

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 4, 6, 8, 7 ,5 ,2};
        sort(arr);
        SortUtil.print(arr);
    }

    /**
     * @Description: 冒泡排序 - 外层循环
     * @param  arr
     * @return void
     * @Author: S.Xinlei
     * @Date:   2019/9/16 0016 18:26
     */
    static void sort(int[] arr) {
        for (int i = arr.length - 1; i > 0; i--) {
            findMax(arr, i);
        }
    }

    /**
     * @Description: 冒泡排序 - 内层循环
     * @param  arr,n
     * @return void
     * @Author: S.Xinlei
     * @Date:   2019/9/16 0016 18:23
     */
    static void findMax(int[] arr, int n) {
        for (int j = 0; j < n; j++) {
            if (arr[j] > arr[j+1]) {
                /* 位置交换 */
                SortUtil.swap(arr, j, j+1);
            }
        }
    }
}
