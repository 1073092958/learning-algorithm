package com.huawei.sort;
/*
5,4,3,2,1
第一轮
4,5,3,2,1
 */

/**
 * 插入排序
 *
 * @author YOUYAYAYA
 * @since 2021/1/9
 */
public class InsertSort {
    public static void sort(Comparable[] arr) {
        for (int i = 1; i < arr.length; i++) {
            for (int j = i; j > 0; j--) {
                if (SortHelper.less(arr[j], arr[j - 1])) {
                    SortHelper.exchange(arr, j, j - 1);
                } else {
                    break;
                }
            }
        }
    }
}
