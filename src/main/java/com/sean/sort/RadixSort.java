package com.sean.sort;

import java.util.Arrays;

/**
 * @SourceVideo: https://space.bilibili.com/406692798
 * @Description: 基数排序
 * @Author: S.Xinlei
 * @Date: 2019/9/19 0019 8:56
 */
public class RadixSort {

    /**
     * 非比较排序
     * 桶思想的一种
     * 多关键字的排序
     */

    public static void main(String[] args) {

        int[] arr = {421, 240, 155, 532, 305, 430, 124};

        /* TODO： 先过滤数组，求最高位数，而后调用sort()，传入数组与最高位数，用于外层循环的 i < 最高位数 */

        int[] result = sort(arr);

        System.out.println(Arrays.toString(result));
    }

    static int[] sort(int[] arr) {
        /* 结果数组，与原数组长度一样，指一个空间的分配 */
        int[] result = new int[arr.length];
        /* 桶 */
        int[] count = new int[10];

        for (int i = 0; i < 3; i++) {
            int divsion = (int)Math.pow(10, i);

            /* 内层循环，每一次都是计数排序，从个位到十位完成后，就是完成了基数排序 */
            for (int j = 0; j < arr.length; j++) {
                int num = arr[j] / divsion % 10;
                count[num]++;
            }

            for (int m = 1; m < count.length; m++) {
                count[m] = count[m] + count[m - 1];
            }

            for (int n = arr.length - 1; n >= 0; n--) {
                int num = arr[n] / divsion % 10;
                result[--count[num]] = arr[n];
            }

            System.arraycopy(result, 0, arr, 0, arr.length);
            Arrays.fill(count, 0);
        }

        return result;
    }

}
