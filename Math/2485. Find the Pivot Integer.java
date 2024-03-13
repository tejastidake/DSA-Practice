/*
Given a positive integer n, find the pivot integer x such that:

The sum of all elements between 1 and x inclusively equals the sum of all elements between x and n inclusively.
Return the pivot integer x. If no such integer exists, return -1. It is guaranteed that there will be at most one pivot index for the given input.
*/

// Runtime: 1ms (Beats 77.54%) | Memory: 40.15MB (Beats 94.39%)

// Math, Prefix Sum

// Solution: https://leetcode.com/problems/find-the-pivot-integer/solutions/4867145/runtime-beats-77-54-memory-beats-94-39-solution


class Solution {
    public int pivotInteger(int n) {

        int lsum = 0;
        int rsum = 0;

        int m=1;

        while (m<=n){
            if (lsum == rsum && m==n) return m;
            
            if (lsum <= rsum){
                lsum+=m;
                m++;
            }
            else if (lsum > rsum){
                rsum+=n;
                n--;
            }
        }

        return -1;
    }
}
