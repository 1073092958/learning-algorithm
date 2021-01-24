package com.huawei.priorityqueue;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author YOUYAYAYA
 * @createTime 2021/1/24
 */
public class TestMinPriorityQueue {
    @Test
    public void test(){
        MinPriorityQueue<Integer> priorityQueue = new MinPriorityQueue<>(10);
        priorityQueue.insert(5);
        priorityQueue.insert(4);
        priorityQueue.insert(6);
        priorityQueue.insert(8);
        priorityQueue.insert(9);
        priorityQueue.insert(5);
        System.out.println(Arrays.toString(priorityQueue.items));
        System.out.println("----------------------");
        System.out.println(priorityQueue.delMin());
        System.out.println(Arrays.toString(priorityQueue.items));
    }
}
