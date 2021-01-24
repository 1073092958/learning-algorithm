package com.huawei.sort;

/**
 * 排序helper类
 *
 * @since 2021/1/9
 * @author YOUYAYAYA
 */
@SuppressWarnings({"rawtypes", "unchecked"})
public class SortHelper {

    public static boolean greater(Comparable v, Comparable w) {
        return v.compareTo(w) > 0;
    }

    public static boolean less(Comparable v, Comparable w) {
        return v.compareTo(w) < 0;
    }

    public static void exchange(Comparable[] arr,int i,int j){
        Comparable temp = null;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
