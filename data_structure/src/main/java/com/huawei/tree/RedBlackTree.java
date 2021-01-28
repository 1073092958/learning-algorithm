package com.huawei.tree;

/**
 * 红黑树
 *
 * @author YOUYAYAYA
 * @createTime 2021/1/26
 */
public class RedBlackTree<Key extends Comparable<Key>, Value> {
    class Node {
        Key key;
        Value value;
        Node left;
        Node right;
        // 父节点指向这个节点的颜色
        boolean color;

        public Node(Key key, Value value, Node left, Node right, boolean color) {
            this.key = key;
            this.value = value;
            this.left = left;
            this.right = right;
            this.color = color;
        }
    }

    // 根节点
    private Node root;
    // 元素个数
    private int N;
    // 红色链接
    private static final boolean RED = true;
    // 黑色链接
    private static final boolean BLACK = false;

    private boolean isRed(Node x) {
        if (x == null) {
            return false;
        }
        return x.color == RED;
    }

    // 左旋方法
    private Node rotateLeft(Node h) {
        // 获取右子节点
        Node x = h.right;
        // x的左子节点成为h右子节点
        h.right = x.left;
        // 让h节点成为x的左子节点
        x.left = h;
        // x的颜色为h节点的颜色
        x.color = h.color;
        // h节点变为红色
        h.color = RED;
        return x;
    }

    // 右旋方法
    private Node rotateRight(Node h) {
        // 获取h节点的左子节点
        Node x = h.left;
        // x的右子节点成为h的左子节点
        h.left = x.right;
        // x的右子节点变为h
        x.right = h;
        // x的color变成h的color
        x.color = h.color;
        // h的color变为红色
        h.color = RED;
        return x;
    }

    // 颜色反转
    private void flipColors(Node h) {
        h.color = RED;
        h.left.color = BLACK;
        h.right.color = BLACK;
    }

    /**
     * 添加元素方法
     *
     * @param key   key
     * @param value value
     */
    public void put(Key key, Value value) {
        root = put(root, key, value);
        // 根节点颜色总是黑色
        root.color = BLACK;
    }

    private Node put(Node h, Key key, Value value) {
        // 判断h是否为空
        if (h == null) {
            N++;
            return new Node(key, value, null, null, RED);
        }
        int cmp = key.compareTo(h.key);
        if (cmp > 0) {
            h.right = put(h.right, key, value);
        } else if (cmp < 0) {
            h.left = put(h.left, key, value);
        } else {
            h.value = value;
        }
        // 进行左旋 左子节点为黑,右子节点为红色
        if (isRed(h.right) && !isRed(h.left)) {
            h = rotateLeft(h);
        }
        // 进行右旋
        if (isRed(h.left) && isRed(h.left.left)) {
            h = rotateRight(h);
        }
        // 颜色反转
        if (isRed(h.left) && isRed(h.right)) {
            flipColors(h);
        }
        return h;
    }

    /**
     * 取元素的方法
     *
     * @param key key
     * @return value
     */
    public Value get(Key key) {
        return get(root, key);
    }

    private Value get(Node h, Key key) {
        if (h == null) {
            return null;
        }
        int cmp = key.compareTo(h.key);
        if (cmp < 0) {
            return get(h.left, key);
        } else if (cmp > 0) {
            return get(h.right, key);
        } else {
            return h.value;
        }
    }

    public int size() {
        return N;
    }
}
