package com.huawei;

/**
 * helper类
 *
 * @author YOUYAYAYA
 * @createTime 2021/1/24
 */
@SuppressWarnings("ALL")
public class Helper {

    /**
     * 判断v是否比w大
     *
     * @param v v
     * @param w w
     * @return true or false
     */
    public static boolean greater(Comparable[] arr,int v, int w) {
        return arr[v].compareTo(arr[w]) > 0;
    }

    /**
     * 判断v是否比w小
     *
     * @param v v
     * @param w w
     * @return true or false
     */
    public static boolean less(Comparable[] arr,int v, int w) {
        return arr[v].compareTo(arr[w]) < 0;
    }

    /**
     * 交换arr[i]和arr[j]
     *
     * @param arr 数组
     * @param i 索引
     * @param j 索引
     */
    public static void exchange(Comparable[] arr,int i,int j){
        Comparable temp = null;
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
