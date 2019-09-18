package com.sean.sort;

/**
 * @SourceVideo  https://space.bilibili.com/406692798
 * @Description: 归并排序
 * @Author: S.Xinlei
 * @Date: 2019/9/18 0018 9:30
 */
public class MergeSort {

    /* 归并前 回顾递归的概念
        - 方法在内存中的执行过程
       递归：一个方法在它自身内部执行的过程中调用自身
            - 小程序 Recursion.java
     */

    public static void main(String[] args) {
        /* 假设两个子数组为有序数组，从而进行MergeSort归并排序 */
        int[] arr = {1, 4, 7, 8, 3, 6, 9};
        sort(arr, 0 , arr.length - 1);
        SortUtil.print(arr);
    }

    static void sort(int[] arr, int left, int right) {
        if (left == right) { return;}
        /* 分成两半，中间值 */
        int mid = left + (right - left) / 2;
        /* 左边排序 */
        sort(arr, left, mid);
        /* 右边排序 */
        sort(arr, mid + 1, right);
        merge(arr, left, mid + 1, right);
    }

    static void merge(int[] arr, int leftPtr, int rightPtr, int rightBound) {
        /* 中间的位置 */
        int mid = rightPtr - 1;
        /* 分配一个新的辅助空间 */
        int[] temp = new int[rightBound - leftPtr + 1];

        /* 3个指针 */
        int i = leftPtr;
        int j = rightPtr;
        int k = 0;

        /* 逐步优化三种写法 */
        while (i <= mid && j <= rightBound) {
            /* 第一种写法 */
            if (arr[i] <= arr[j]) {
                temp[k] = arr[i];
                i++;
                k++;
            } else {
                temp[k] = arr[j];
                j++;
                k++;
            }

            /* 第二种写法 */
/*

            if (arr[i] <= arr[j]) {
                temp[k++] = arr[i++];
            } else {
                temp[k++] = arr[j++];
            }
*/

            /* 第三种写法 */
/*
            temp[k++] = arr[i] <= arr[j] ? arr[i++] : arr[j++];
*/
        }
        while (i <= mid) { temp[k++] = arr[i++]; }
        while (j <= rightBound) { temp[k++] = arr[j++]; }

        for (int m = 0; m < temp.length; m++) { arr[leftPtr + m] = temp[m];}
    }



    /* JAVA对象 排序专用算法 --- TimSort --- 改进的归并排序 --- JAVA内部&Pthony内部采用的都是此种排序方法
        - 对象排序一般要求稳定

       TimSort：
            归并排序 + 二分插入排序
    */
}
