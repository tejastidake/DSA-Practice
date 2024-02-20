/*
Given an array nums containing n distinct numbers in the range [0, n], return the only number in the range that is missing from the array.
*/

// Runtime: 5ms (Beats 31.08%) | Memory: 45.04MB (Beats 74.57%)

// Array, Hash Table, Math, Binary Search, Bit Manipulation, Sorting

// Solution: https://leetcode.com/problems/missing-number/solutions/4755587/easy-solution-pod-with-explanation


class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);

        for (int i=0; i<nums.length; i++){
            if (nums[i] != i) return i;
        }
        return nums.length;
    }
}
