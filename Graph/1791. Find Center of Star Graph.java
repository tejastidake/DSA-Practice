/*
There is an undirected star graph consisting of n nodes labeled from 1 to n. A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.

You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi. Return the center of the given star graph.
*/

// Runtime: 0ms (Beats 100%) | Memory: 66.78MB (Beats 73.75%)

// Graph

// Solution: https://leetcode.com/problems/find-center-of-star-graph/solutions/5002092/runtime-beats-100-o-1-and-memory-beats-74-o-1-easy-2-lines-solution


class Solution {
    public int findCenter(int[][] edges) {
        if ((edges[0][0] == edges[1][0]) || (edges[0][1] == edges[1][0])) return edges[1][0];
        return edges[1][1];
    }
}
