package com.huawei.sort;

/**
 * 希尔排序
 *
 * @author YOUYAYAYA
 * @since 2021/1/9
 */
public class ShellSort {
    public static void sort(Comparable[] arr) {
        int h = 1;
        while (h < arr.length) {
            h = 2 * h + 1;
        }
        while (h >= 1) {
            for (int i = h; i < arr.length; i++) {
                for (int j = i; j >= h; j -= h) {
                    if (SortHelper.less(arr[j], arr[j - h])) {
                        SortHelper.exchange(arr, j, j - h);
                    } else {
                        break;
                    }
                }
            }
            h = h / 2;
        }
    }
}
