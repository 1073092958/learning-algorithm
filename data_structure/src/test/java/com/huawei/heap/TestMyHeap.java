package com.huawei.heap;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author YOUYAYAYA
 * @createTime 2021/1/23
 */
public class TestMyHeap {
    @Test
    public void test(){
        MyHeap<Integer> heap = new MyHeap<>(10);
        heap.insert(5);
        heap.insert(4);
        heap.insert(6);
        heap.insert(8);
        heap.insert(9);
        heap.insert(5);
        System.out.println(Arrays.toString(heap.items));
        System.out.println("----------------------");
        System.out.println(heap.delMax());
        System.out.println(Arrays.toString(heap.items));
    }
}
