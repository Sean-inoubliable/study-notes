package com.sean.sort;

/**
 * @SourceVideo  https://space.bilibili.com/406692798
 * @Description: 快速排序与双轴排序
 * @Author: S.Xinlei
 * @Date: 2019/9/18 0018 14:28
 */
public class QuickSort {

    /*
    - 如果 Arrays.sort() 中排的是基础数据类型，那么它里面使用的就是双轴快排
        既然是双轴快排，肯定有个轴，这个轴怎么解释呢
            - 以一个节点为轴，左右移动。条件 [nodes] < 轴 < [nodes]
    - 快速排序经典的是单轴快排，改进的是双轴快排
    */

    /* TODO：待优化 */

    public static void main(String[] args) {
        int[] arr = {7, 3, 2, 10, 8, 1, 9, 5, 4, 6};
        sort(arr, 0, arr.length - 1);
        SortUtil.print(arr);
    }

    static void sort(int[] arr, int leftBound, int rightBound) {
        /* 边界检查 */
        if (leftBound >= rightBound) { return;}
        int mid = partition(arr, leftBound, rightBound);
        sort(arr, leftBound, mid - 1);
        sort(arr, mid + 1, rightBound);
    }

    static int partition(int[] arr, int leftBound, int rightBound) {
        /* 轴 */
        int pivot = arr[rightBound];
        int left = leftBound;
        int right = rightBound - 1;

        while (left <= right) {
            while (left <= right && arr[left] <= pivot) { left++;}
            while (left <= right && arr[right] > pivot) { right--;}

            if (left < right) { SortUtil.swap(arr, left, right);}
        }

        SortUtil.swap(arr, left, rightBound);

        return left;
    }

    /*
     传统快速排序：中间找到一个数，将其当成轴，[nodes] < '轴' < [nodes]。
     双轴快排：JAVA源码内部使用的就是双轴快排
        - 找两个数，将整个数组分成三个区域 [nodes] < '轴1' < [nodes] < '轴2' < [nodes]
    */
}
