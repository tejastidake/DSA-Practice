/*
You are given an array of integers nums. Return the length of the longest subarray of nums which is either strictly increasing or strictly decreasing.
*/

// Runtime: 1ms (Beats 100%) | Memory: 43.07MB (Top 100%)

// Array

// Solution: https://leetcode.com/problems/longest-strictly-increasing-or-strictly-decreasing-subarray/solutions/4987953/runtime-100-memory-100-easy-solution


class Solution {
    public int longestMonotonicSubarray(int[] nums) {
        int ansInc = 0;
        int ansDec = 0;
        for (int i = 0; i < nums.length; i++) {
            int inc = 1;
            int dec = 1;
            for (int j = i; j < nums.length - 1; j++) {
                if (nums[j] < nums[j + 1]) {
                    inc++;
                    ansInc = Math.max(inc, ansInc);
                    dec = 1;
                }
                else if (nums[j] > nums[j + 1]) {
                    dec++;
                    ansDec = Math.max(dec, ansDec);
                    inc = 1;
                }
                else {
                    inc = 1;
                    dec = 1;
                }
            }
            ansDec = Math.max(dec, ansDec);
            ansInc = Math.max(inc, ansInc);
        }
        return Math.max(ansInc, ansDec);
    }
}
