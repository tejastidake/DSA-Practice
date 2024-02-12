/*
Given two positive integers a and b, return the number of common factors of a and b.
An integer x is a common factor of a and b if x divides both a and b.
*/

// Runtime: 1ms (Beats 56.75%) | Memory: 40.15MB (Beats 68.45%)

// Math, Enumeration, Number Theory

// Solution: https://leetcode.com/problems/number-of-common-factors/solutions/4715878/3-lines-easy-solution-full-explanation


class Solution {
    public int commonFactors(int a, int b) {
        int ans = 0;
        for (int i=1; i<=Math.min(a,b); i++){
            if (a%i==0 && b%i==0) ans++;
        }
        return ans;
    }
}
