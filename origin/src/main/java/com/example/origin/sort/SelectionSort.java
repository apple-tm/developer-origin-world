package com.example.origin.sort;

/**
 * 算法思想
 * 1.第一次排序选择出最大（最小）的元素放在最后（最前）的位子（每次交换一次）
 * 2.第二次排序同第一次（排除第一次排好的元素）
 * 3.依次类推直到 n-1 次排序，序列有序
 * 4.排序次数无法优化、算法不稳定
 */
public class SelectionSort {

    // 待排序数组
    private static int[] arr = {91, 82, 73, 64, 55, 46 ,37, 28};

    public static int[] sort(int[] arr) {
        // 确定排序次数 4321 n-1次 至少两个元素才能比较交换
        int sortTime = arr.length - 1;
        // 定义每次选择的最大（最小）元素下标 默认第一个元素最大（最小）
        int index = 0;
        for (int i=sortTime; i>0; i--) {
            for (int j=0; j<i; j++) {
                if (arr[index] < arr[j+1]) {
                    index = j+1;
                }
            }
            // 交换
            int temp = arr[index];
            arr[index] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        sort(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
