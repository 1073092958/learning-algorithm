package com.huawei.heap;

/**
 * @author YOUYAYAYA
 * @createTime 2021/1/23
 */
@SuppressWarnings("unchecked")
public class MyHeap<T extends Comparable<T>> {
    T[] items;
    int N;

    // 索引0位置不存元素
    public MyHeap(int capacity) {
        this.items = (T[]) new Comparable[capacity + 1];
        this.N = 0;
    }

    public boolean less(int i, int j) {
        return items[i].compareTo(items[j]) < 0;
    }

    public void exchange(int i, int j) {
        T temp = items[i];
        items[i] = items[j];
        items[j] = temp;
    }

    public void insert(T t) {
        items[++N] = t;
        swim(N);
    }

    public T delMax() {
        T max = items[1];
        // 交换1位置和N位置的元素,直接删除最大元素,1位置下沉到合适位置
        exchange(1, N);
        items[N] = null;
        sink(1);
        return max;
    }

    /**
     * 上浮方法
     *
     * @param k 上浮的元素索引
     */
    public void swim(int k) {
        while (k > 1) {
            if (less(k / 2, k)) {
                exchange(k, k / 2);
            }
            k = k / 2;
        }
    }

    /**
     * 下沉方法
     *
     * @param k 下沉的元素索引
     */
    public void sink(int k) {
        int max;
        while (2 * k <= N) {
            //判断右子节点是否存在
            if(2*k+1<=N){
                if(less(2*k,2*k+1)){
                    max = 2*k+1;
                }else {
                    max = 2*k;
                }
            }else {
                max = 2*k;
            }
            if(less(k,max)){
                break;
            }
            exchange(k,max);
            k = max;
        }
    }
}
