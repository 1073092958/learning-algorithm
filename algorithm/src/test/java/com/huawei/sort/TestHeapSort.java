package com.huawei.sort;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author YOUYAYAYA
 * @createTime 2021/1/23
 */
public class TestHeapSort {
    @Test
    public void testSort(){
        Integer[] arr = {9,8,7,6,5,4,3,2,1};
        HeapSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
