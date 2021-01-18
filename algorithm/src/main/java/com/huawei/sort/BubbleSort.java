package com.huawei.sort;

/**
 * 冒泡排序
 *
 * @author YOUYAYAYA
 * @since 2021/1/9
 */
public class BubbleSort {

    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (SortHelper.greater(arr[j], arr[j + 1])) {
                    SortHelper.exchange(arr, j, j + 1);
                }
            }
        }
    }
}
