package com.huawei.priorityqueue;

import com.huawei.Helper;

/**
 * @author YOUYAYAYA
 * @createTime 2021/1/24
 */
@SuppressWarnings("ALL")
public class MinPriorityQueue<T extends Comparable<T>> {
     T[] items;
     int N;

    public MinPriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public int size() {
        return N;
    }

    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }

    public T delMin() {
        T min = items[1];
        Helper.exchange(items, 1, N);
        items[N] = null;
        sink(1);
        return min;
    }

    public void swim(int k) {
        while (k > 1) {
            if (Helper.less(items, k, k / 2)) {
                Helper.exchange(items, k, k / 2);
            }
            k = k / 2;
        }
    }

    public void sink(int k) {
        while (2 * k <= N) {
            int min = 2 * k;
            if (2 * k + 1 <= N) {
                if (Helper.greater(items, 2 * k, 2 * k + 1)) {
                    min = 2 * k + 1;
                }
            }
            if (Helper.less(items, k, min)) {
                break;
            }
            Helper.exchange(items, k, min);
            k = min;
        }
    }
}
