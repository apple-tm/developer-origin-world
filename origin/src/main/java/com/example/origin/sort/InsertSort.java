package com.example.origin.sort;

/**
 * 算法思想
 * 1.第一次默认第一个元素有序
 * 2.第二次把第二个元素和第一个元素比较交换使得两个元素有序
 * 3.第三次把第三个元素和前面有序的元素比较交换（类似倒过来的冒泡）找到有序的位置，不断交换直到有序
 */
public class InsertSort {

    private static int[] arr = {91, 82, 73, 64, 55, 46 ,37, 28};

    public static int[] sort(int[] arr) {
        // 排序次数 4321 n-1次
        int sortTime = arr.length - 1;
        for (int i=0; i<sortTime; i++) {
            // i+1 因为i=0；不会进行比较
            for (int j=i+1; j>0; j--) {
                if (arr[j] < arr[j-1]) {
                    int temp = arr[j];
                    arr[j] = arr[j-1];
                    arr[j-1] = temp;
                }
            }
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
