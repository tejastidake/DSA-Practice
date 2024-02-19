/*
Given an integer n, return true if it is a power of two. Otherwise, return false.
An integer n is a power of two, if there exists an integer x such that n == 2x.
*/

// Runtime: 1ms (Beats 49.23%) | Memory: 40.72MB (Beats 56.93%)

// Math, Bit Manipulation, Recursion

// Solution: https://leetcode.com/problems/power-of-two/solutions/4749028/easiest-3-lines-solution-1ms-space-o-1-time-o-log-n


class Solution {
    public boolean isPowerOfTwo(int n) {
        for (int i=0; Math.pow(2,i)<=n; i++){
            if (Math.pow(2,i) == n) return true;
        }
        return false;
    }
}
