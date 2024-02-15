/*
You are given a 0-indexed integer array nums of even length consisting of an equal number of positive and negative integers.
You should rearrange the elements of nums such that the modified array follows the given conditions:

1. Every consecutive pair of integers have opposite signs.
2. For all integers with the same sign, the order in which they were present in nums is preserved.
3. The rearranged array begins with a positive integer.

Return the modified array after rearranging the elements to satisfy the aforementioned conditions.
*/

// Runtime: 3ms (Beats 100%) | Memory: 76.83MB (Beats 66%)

// Arrays, Two Pointer, Simulation

// Solution: https://leetcode.com/problems/rearrange-array-elements-by-sign/solutions/4729405/top-1-beats-100-explained-optimized


class Solution {
    public int[] rearrangeArray(int[] nums) {

        int[] ans = new int[nums.length];
        int pos = 0, neg = 1;

        for (int i : nums){
            if (i>0) {
                ans[pos] = i;
                pos+=2;
            }
            else {
                ans[neg] = i;
                neg+=2;
            }

        }
        
        return ans;
    }
}
