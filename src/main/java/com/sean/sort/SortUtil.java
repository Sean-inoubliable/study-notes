package com.sean.sort;

/**
 * @Description: 排序工具类
 * @Author: S.Xinlei
 * @Date: 2019/9/16 0016 17:50
 */
public class SortUtil {
    /**
     * @Description: 交换位置
     * @param   arr,i,j
     * @return  void
     * @Author: S.Xinlei
     * @Date:   2019/9/16 0016 14:40
     */
    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    /**
     * @Description: 遍历打印
     * @param   arr
     * @return  void
     * @Author: S.Xinlei
     * @Date:   2019/9/16 0016 14:40
     */
    static void print(int[] arr) {
        for (int end = 0; end < arr.length; end++) {
            System.out.print(arr[end] + " ");
        }
    }
}
