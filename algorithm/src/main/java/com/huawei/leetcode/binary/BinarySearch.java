package com.huawei.leetcode.binary;

/**
 * 二分查找
 *
 * @author YOUYAYAYA
 * @createTime 2021/1/16
 */
public class BinarySearch {
    /**
     * 二分查找的正常实现
     *
     * @param nums 数组
     * @param key 元素
     * @return 返回的索引
     */
    public static int search(int[] nums, int key) {
        int lo = 0;
        int hi = nums.length;
        while (lo <= hi) {
            int mid = lo + (hi - lo) / 2;
            if (nums[mid] == key) {
                return mid;
            } else if (nums[mid] < key) {
                lo = mid + 1;
            } else {
                hi = mid - 1;
            }
        }
        return -1;
    }
}
