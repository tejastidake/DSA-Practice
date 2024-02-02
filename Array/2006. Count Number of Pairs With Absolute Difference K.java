/*
Given an integer array nums and an integer k, return the number of pairs (i, j) where i < j such that |nums[i] - nums[j]| == k.
The value of |x| is defined as:
x if x >= 0.
-x if x < 0.
*/

// Runtime: 7ms (Beats 56.92%) | Memory: 43.58MB (Top 40.67%)

// Array, Hash Table, Counting

// Solution: https://leetcode.com/problems/count-number-of-pairs-with-absolute-difference-k/solutions/4665755/brute-force-in-java


class Solution {
    public int countKDifference(int[] nums, int k) {
        int ans = 0;
        for (int i=0; i<nums.length-1; i++){
            for (int j=i+1; j<nums.length; j++){
                if (Math.abs(nums[i]-nums[j]) == k){
                    ans++;
                }
            }
        }
        return ans;
    }
}
