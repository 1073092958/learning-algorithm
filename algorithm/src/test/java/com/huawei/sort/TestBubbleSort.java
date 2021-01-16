package com.huawei.sort;

import org.junit.Test;

import java.util.Arrays;

public class TestBubbleSort {
    @Test
    public void testSort(){
        Integer[] arr = {9,8,7,6,5,4,3,2,1};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
