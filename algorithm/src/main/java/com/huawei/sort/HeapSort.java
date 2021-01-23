package com.huawei.sort;

/**
 * 堆排序
 *
 * @author YOUYAYAYA
 * @createTime 2021/1/23
 */
@SuppressWarnings("rawtypes")
public class HeapSort {
    /**
     * 排序主方法
     *
     * @param source 源数组
     */
    public static void sort(Comparable[] source) {
        Comparable[] heap = new Comparable[source.length + 1];
        createHeap(source, heap);
        int N = heap.length - 1;
        while (N != 1) {
            SortHelper.exchange(heap, 1, N);
            N--;
            sink(heap, 1, N);
        }
        System.arraycopy(heap, 1, source, 0, source.length);
    }

    // 创建堆的方法
    private static void createHeap(Comparable[] source, Comparable[] heap) {
        System.arraycopy(source, 0, heap, 1, source.length);
        for (int i = (heap.length - 1) / 2; i > 0; i--) {
            sink(heap, i, heap.length - 1);
        }
    }

    // 元素下沉方法
    private static void sink(Comparable[] heap, int target, int range) {
        while (2 * target <= range) {
            int max = 2 * target;
            // 判断右子节点是否存在
            if (2 * target + 1 <= range) {
                // 比较左子节点和右子节点,max去两个之间最大值
                if (SortHelper.less(heap[2 * target], heap[2 * target + 1])) {
                    max = 2 * target + 1;
                } else {
                    max = 2 * target;
                }
            }
            // k位置与max位置进行比较,k的大就不懂,跳出循环
            if (!SortHelper.less(heap[target], heap[max])) {
                break;
            } else {
                SortHelper.exchange(heap, target, max);
            }
            target = max;
        }
    }
}
