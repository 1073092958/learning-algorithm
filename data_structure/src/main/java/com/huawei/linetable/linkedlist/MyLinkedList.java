package com.huawei.linetable.linkedlist;

import java.util.ArrayList;

/**
 * 单链表
 *
 * @author YOUYAYAYA
 * @createTime 2021/1/14 22:57
 * @updateTime
 */
public class MyLinkedList<T> {
    private Node<T> first;
    transient int size;
    private static final int DEFAULT_CAPACITY = 10;


    public MyLinkedList() {
        this.first = new Node<T>(null);
        this.size = 0;
    }

    /**
     * 尾插法
     *
     * @param t 要插入的元素
     * @return true or false
     */
    public boolean backInsert(T t) {
        Node<T> node = new Node<>(t);
        Node<T> currentNode = first;
        while (currentNode.next != null) {
            currentNode = currentNode.next;
        }
        currentNode.next = node;
        size++;
        return true;
    }

    /**
     * 头插法
     *
     * @param t 要添加的元素
     * @return true or false
     */
    public boolean frontInsert(T t) {
        Node<T> node = new Node<T>(t);
        Node<T> temp = first.next;
        first.next = node;
        node.next = temp;
        size++;
        return true;
    }

    public boolean remove(T t){
        Node<T> preNode = first;
        Node<T> currentNode;
        while (preNode.next!=null){
            currentNode = preNode.next;
            if(t.equals(currentNode.data)){
                preNode.next = currentNode.next;
                size--;
                return true;
            }
            preNode = preNode.next;
        }
        return false;
    }

    public void show(){
        Node<T> currentNode = first;
        ArrayList<T> list = new ArrayList<>();
        while (currentNode.next!=null){
            currentNode = currentNode.next;
            list.add(currentNode.data);
        }
        System.out.println(list);
    }

    public boolean isEmpty() {
        return size == 0;
    }

    public void clear(){
        first.next = null;
    }

    public int size(){
        return size;
    }

    private class Node<T> {
        T data;
        Node<T> next;

        public Node(T data) {
            this.data = data;
        }
    }
}
