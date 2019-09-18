package com.sean.sort;

import java.util.Arrays;

/**
 * @SourceVideo  https://space.bilibili.com/406692798
 * @Description: 计数排序
 * @Author: S.Xinlei
 * @Date: 2019/9/18 0018 15:55
 */
public class CountSort {

    /*
    非比较排序，桶思想的一种

    - 数组的量大 & 数组的取值范围小
        - 例如：某大型企业数万名员工，年龄排序
        - 如何快速得知高考名词（腾讯面试）

    - 算法思想：每个数出现了多少次，再以这个数为下标值，记录在新的数组里面
    */

    /* TODO：取值范围问题 */

    public static void main(String[] args) {
        int[] arr = {2, 4, 2, 3, 7, 1, 1, 0, 0, 5, 6, 9, 8, 5, 7, 4, 0, 9}; //0~9
        int[] result = sort(arr);
        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] arr) {
        int[] result = new int[arr.length];

        int[] count = new int[10];

        /* count数组 */
        for (int i = 0; i < arr.length; i++) {
            count[arr[i]]++;
        }

        /* count数组的累加数组 */
        for (int i = 1; i < count.length; i++) {
            count[i] = count[i] + count[i - 1];
        }

        /* 对原数组倒序迭代 */
        for (int i = arr.length - 1; i >= 0; i--) {
            result[--count[arr[i]]] = arr[i];
        }
        return result;
    }
}
