package com.huawei.priorityqueue;

import com.huawei.heap.MyHeap;
import org.junit.Test;

import java.util.Arrays;

/**
 * @author YOUYAYAYA
 * @createTime 2021/1/23
 */
public class TestMaxPriorityQueue {
    @Test
    public void test(){
        MaxPriorityQueue<Integer> priorityQueue = new MaxPriorityQueue<>(10);
        priorityQueue.insert(5);
        priorityQueue.insert(4);
        priorityQueue.insert(6);
        priorityQueue.insert(8);
        priorityQueue.insert(9);
        priorityQueue.insert(5);
        System.out.println(Arrays.toString(priorityQueue.items));
        System.out.println("----------------------");
        System.out.println(priorityQueue.delMax());
        System.out.println(Arrays.toString(priorityQueue.items));
    }
}
