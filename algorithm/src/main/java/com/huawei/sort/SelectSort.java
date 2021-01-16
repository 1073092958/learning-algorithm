package com.huawei.sort;
/*
5,4,3,2,1
第一轮
1,5,4,3,2
第二轮
1,2,5,4,3
每一轮两两比较选出一个最小值,放到i索引处
 */

/**
 * 插入排序
 *
 * @author YOUYAYAYA
 * @since 2021/1/9
 */
public class SelectSort {
    public static void sort(Comparable[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length - 1; j++) {
                if (SortHelper.greater(arr[j], arr[j + 1])) {
                    min = j + 1;
                }
            }
            SortHelper.exchange(arr, min, i);
        }
    }
}
