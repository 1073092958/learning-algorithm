package com.huawei.linetable.queue;

/**
 * @author YOUYAYAYA
 * @since 2021/1/29
 */
public class Queue<T> {
    private class Node<T> {
        T data;
        Node next;

        public Node(T data, Node next) {
            this.data = data;
            this.next = next;
        }
    }

    // 元素的数量
    private int count;
    private Node<T> first;
    private Node<T> last;

    public Queue() {
        this.count = 0;
        this.first = new Node<T>(null, null);
        this.last = new Node<T>(null, null);
    }

    public int size() {
        return count;
    }

    public boolean isEmpty() {
        return count == 0;
    }

    public void enqueue(T data) {
        Node<T> newNode = new Node<>(data, null);
        if(isEmpty()){
            first.next = newNode;
            last = newNode;
        }
        last.next = newNode;
        last = newNode;
        count++;
    }

    public T dequeue() {
        if(isEmpty()){
            return null;
        }
        Node<T> newNode = first.next;
        first.next = newNode.next;
        count--;
        return newNode.data;
    }
}
