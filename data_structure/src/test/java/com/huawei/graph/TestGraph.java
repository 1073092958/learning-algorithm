package com.huawei.graph;

import org.junit.Test;

/**
 * @author YOUYAYAYA
 * @since 2021/1/29
 */
public class TestGraph {
    @Test
    public void test(){
        Graph graph = new Graph(10);
        graph.addEdge(1,2);
        graph.addEdge(1,3);
        graph.addEdge(1,5);
        graph.addEdge(1,7);
        graph.addEdge(2,9);
        System.out.println(graph.E());
    }
}
