package com.huawei.sort;

/**
 * 归并排序
 *
 * @author YOUYAYAYA
 * @since 2021/1/9
 */
@SuppressWarnings("rawtypes")
public class MergeSort {
    public static void sort(Comparable[] arr) {
        int lo = 0;
        int hi = arr.length - 1;
        sort(arr, lo, hi);
    }

    public static void sort(Comparable[] arr, int lo, int hi) {
        if (lo >= hi) {
            return;
        }
        int mid = lo + (hi - lo) / 2;
        sort(arr, lo, mid);
        sort(arr, mid + 1, hi);
        merge(arr, lo, hi, mid);
    }

    public static void merge(Comparable[] arr, int lo, int hi, int mid) {
        int i = lo;
        int left = lo;
        int right = mid + 1;
        Comparable[] helper = new Comparable[arr.length];
        while (left <= mid && right <= hi) {
            if (SortHelper.less(arr[left], arr[right])) {
                helper[i++] = arr[left++];
            } else {
                helper[i++] = arr[right++];
            }
        }

        while (left <= mid) {
            helper[i++] = arr[left++];
        }

        while (right <= hi) {
            helper[i++] = arr[right++];
        }

        System.arraycopy(helper, lo, arr, lo, hi - lo + 1);
    }
}
