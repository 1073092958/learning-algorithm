package com.huawei.leetcode.binary;

import org.junit.Test;

public class TestBinarySearch {
    @Test
    public void testSearch(){
        int[] nums = {1,2,3,4,5,6,7,8,9,12,13,56,89,456,567};
        int key1 = 4;
        int key2 = 1;
        int key3 = 567;
        int key4 = 9;
        System.out.println(BinarySearch.search(nums, key1));
        System.out.println(BinarySearch.search(nums, key2));
        System.out.println(BinarySearch.search(nums, key3));
        System.out.println(BinarySearch.search(nums, key4));
    }
}
