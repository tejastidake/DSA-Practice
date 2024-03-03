/*
You are given a 0-indexed integer array nums, and an integer k.
In one operation, you can remove one occurrence of the smallest element of nums.

Return the minimum number of operations needed so that all elements of the array are greater than or equal to k.
*/

// Runtime: 2ms (Beats 100%) | Memory: 42.95MB (Beats 50%)

// Array

// Solution: https://leetcode.com/problems/minimum-operations-to-exceed-threshold-value-i/solutions/4814388/easy-than-you-think-beats-100-top-1-4-line-solution-easy-explained


class Solution {
    public int minOperations(int[] nums, int k) {
        Arrays.sort(nums);
        byte i = 0;
        while (nums[i] < k) i++;
        return i;
    }
}
