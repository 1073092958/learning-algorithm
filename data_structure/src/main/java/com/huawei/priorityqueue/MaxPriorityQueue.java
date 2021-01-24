package com.huawei.priorityqueue;

/**
 * 最大优先队列,就是堆
 *
 * @author YOUYAYAYA
 * @createTime 2021/1/23
 */
@SuppressWarnings("ALL")
public class MaxPriorityQueue<T extends Comparable<T>> {
    T[] items;
    int N;

    public MaxPriorityQueue(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.N = 0;
    }

    public boolean isEmpty() {
        return N == 0;
    }

    public boolean less(int i, int j) {
        return items[i].compareTo(items[j]) < 0;
    }

    public void exchange(int i, int j) {
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public int size() {
        return N;
    }

    private void swim(int k) {
        while (k > 1) {
            if (less(k / 2, k)) {
                exchange(k, k / 2);
            }
            k = k / 2;
        }
    }

    private void sink(int k) {
        int max;
        while (2 * k <= N) {
            max = 2 * k;
            if (2 * k + 1 <= N) {
                if (less(2 * k, 2 * k + 1)) {
                    max = 2 * k + 1;
                }
            }
            if (less(max, k)) {
                break;
            }
            exchange(k, max);
            k = max;
        }
    }

    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }

    public T delMax() {
        T max = items[1];
        exchange(1, N);
        items[N] = null;
        sink(1);
        return max;
    }
}
