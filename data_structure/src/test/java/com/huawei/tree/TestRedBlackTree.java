package com.huawei.tree;

import org.junit.Test;

/**
 * @author YOUYAYAYA
 * @createTime 2021/1/26
 */
public class TestRedBlackTree {

    @Test
    public void test(){
        RedBlackTree<Integer, String> redBlackTree = new RedBlackTree<>();
        redBlackTree.put(7,"a");
        redBlackTree.put(20,"b");
        redBlackTree.put(21,"c");
        redBlackTree.put(56,"d");
        redBlackTree.put(34,"e");
        redBlackTree.put(23,"f");
        redBlackTree.put(1,"g");
        redBlackTree.put(36,"h");
        redBlackTree.put(44,"i");
        redBlackTree.put(29,"j");
        redBlackTree.put(13,"k");
        System.out.println(redBlackTree.size());
        System.out.println(redBlackTree.get(29));
    }
}
