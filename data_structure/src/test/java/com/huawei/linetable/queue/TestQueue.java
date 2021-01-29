package com.huawei.linetable.queue;

import org.junit.Test;

/**
 * @author YOUYAYAYA
 * @since 2021/1/29
 */
public class TestQueue {
    @Test
    public void test(){
        Queue<Integer> queue = new Queue<>();
        queue.enqueue(1);
        queue.enqueue(2);
        queue.enqueue(3);
        queue.enqueue(4);
        queue.enqueue(5);
        queue.enqueue(6);
        System.out.println(queue.size());
        System.out.println("-----");
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println(queue.dequeue());
        System.out.println("-----");
        System.out.println(queue.size());
    }
}
