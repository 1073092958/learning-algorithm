package com.huawei.graph;

import com.huawei.linetable.queue.Queue;

/**
 * 邻接表实现无向图
 *
 * @author YOUYAYAYA
 * @since 2021/1/29
 */
@SuppressWarnings("ALL")
public class Graph {
    // 顶点的个数
    private final int V;
    // 边的条数
    private int E;
    private Queue<Integer>[] adj;

    public Graph(int V) {
        this.V = V;
        this.E = 0;
        this.adj = new Queue[V];
        for (int i = 0; i < adj.length; i++) {
            adj[i] = new Queue<Integer>();
        }
    }

    public int V() {
        return V;
    }

    public int E() {
        return E;
    }

    public void addEdge(int v, int w) {
        adj[v].enqueue(w);
        adj[w].enqueue(v);
        E++;
    }

    public Queue adj(int v) {
        return adj(V);
    }
}
