package com.example.origin.sort;

/**
 * 算法思想
 * 1.从头到尾相邻元素一一比较，如果第i个元素大于 第i+1个元素，两个元素交换位子，一趟内循环将最大的元素交换到了末尾
 * 2.第二趟排除第一趟的最大元素，第二大元素就交换到了倒数第二个位子
 * 3.依次类推直到第一个元素为最小元素，整个序列有序
 * 4.优化：如果一次排序没有交换发生，就说明序列已经有序，无需继续对比排序了
 * 5.一次排序最多交换 n-1 次，而选择排序每次排序交换一次
 */
public class BubbleSort {

    // 待排序数组
    private static int[] arr = {1, 2, 3, 4, 5, 6 ,7, 8};

    public static int[] bubble(int[] arr) {
        // 排序次数最差次数 4321 逆序，需要排序 3 次，推论 n 个元素最差需排序 n-1次
        int sortTime = arr.length-1;
        for (int i=sortTime; i>0; i--) {
            boolean exchange = false;
            // 一次排序需要对比的元素个数,是一个变量，每次排序后参与对比的最大元素不再参加对比，首次是所有元素参加，以后每次 -1
            for (int j=0; j<i; j++) {
                if (arr[j] > arr[j+1]) {
                    // 交换相邻元素
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                    exchange = true;
                }
            }
            if (!exchange) {
                // 排序次数推断 sortTime-i
                System.out.println("优化排序，排序次数为：" +(sortTime-i));
                break;
            }
        }
        return arr;
    }

    public static void main(String[] args) {
        bubble(arr);
        for (int i=0; i<arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
