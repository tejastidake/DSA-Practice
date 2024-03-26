/*
Given an unsorted integer array nums. Return the smallest positive integer that is not present in nums.

You must implement an algorithm that runs in O(n) time and uses O(1) auxiliary space.
*/

// Runtime: 23ms (Beats 5.43%) | Memory: 54.47MB (Beats 97.70%)

// Array, Hash Table

// Solution: https://leetcode.com/problems/first-missing-positive/solutions/4925668/easy-4-lines-solution-without-hashtable-beats-97-7-o-1-memory-space


class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length; i++){
            if (Arrays.binarySearch(nums, i+1) < 0) return i+1;
        }
        return nums[nums.length-1]+1;
    }
}
