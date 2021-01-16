package com.huawei.sort;

import org.junit.Test;

import java.util.Arrays;

public class TestInsertSort {
    @Test
    public void testSort(){
        Integer[] arr = {9,8,7,6,5,4,3,2,1};
        InsertSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
