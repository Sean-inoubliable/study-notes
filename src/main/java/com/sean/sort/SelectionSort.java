package com.sean.sort;

/**
 * @SourceVideo  https://space.bilibili.com/406692798
 * @Description  选择排序
 * @Author  S.Xinlei
 * @CreateDate  2019/9/16 0016 10:49
 */
public class SelectionSort {
    /* 算法 - 锻炼逻辑思维能力 */
    /* 需要大量练习 拓宽思路 */

    /**
     *  大O分析
     *  [ 数组初始化 / 打印中间结果 不计入算法时间 ]
     *  { 忽略常数项 / 忽略低次项 }
     *
     *   时间复杂度 : 执行时间 , 循环 大小等条件影像 (执行最多的一条语句随着规模扩大所受到的影响)
     *
     *   空间复杂度 : 执行空间 , 算法需要用到的额外空间
     */

    /* TODO: 优化, 1. 每次循环除最小值之外 , 找出最大值移动到数组末尾 */

    public static void main(String[] args) {
        int[] arr = {9, 3, 1, 4, 6, 8, 7 ,5 ,2};
        sort(arr);
        SortUtil.print(arr);
    }

    /**
     * @Description: 选择排序
     * @param   arr
     * @return  void
     * @Author: S.Xinlei
     * @Date:   2019/9/16 0016 14:47
     */
    static void sort(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            /* 首先假设最小值的位置 */
            int minPos = i;

            /* 确定最小值的位置 */
            for (int j = i + 1; j < arr.length; j++) {
                minPos = arr[j] < arr[minPos] ? j : minPos;
            }

            /* 交换 minPos 与 i 的位置 */
            SortUtil.swap(arr, i, minPos);
        }
    }
}
