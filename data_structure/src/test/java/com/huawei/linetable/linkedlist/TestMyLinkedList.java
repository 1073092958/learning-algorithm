package com.huawei.linetable.linkedlist;

import org.junit.Test;

public class TestMyLinkedList {
    @Test
    public void test(){
        MyLinkedList<Integer> list = new MyLinkedList<>();
        list.backInsert(1);
        System.out.println(list.size);
        list.backInsert(2);
        list.backInsert(3);
        list.backInsert(4);
        list.backInsert(5);
        list.frontInsert(8);
        list.frontInsert(9);
        list.show();
        list.remove(2);
        list.show();
        System.out.println(list.remove(5));
        list.show();
        System.out.println(list.size);
    }
}
