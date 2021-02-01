package com.example.origin.sort;

/**
 * 算法思想
 *
 * 1.在序列选取一个标点元素（最好取序列的中点，如果选取多个标点元素，注意选取位置）
 * 2.分区过程，将比这个数（标点元素）大的数全放到它的右边，小于或等于它的数全放到它的左边。
 * 3.再对左右区间重复(递归)第二步，直到各区间只有一个数。
 */
public class QuickSort {

    private static int[] arr = {91, 82, 73, 64, 55, 46 ,37, 28};

    public static int[] sort(int[] arr, int left, int right) {
        // 选取标点
        int pivot = arr[(left+right)/2];
        int i = left;
        int j = right;

        return null;
    }
}
