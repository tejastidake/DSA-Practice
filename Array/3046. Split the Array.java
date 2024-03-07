/*
You are given an integer array nums of even length. You have to split the array into two parts nums1 and nums2 such that:

nums1.length == nums2.length == nums.length / 2.
nums1 should contain distinct elements.
nums2 should also contain distinct elements.
Return true if it is possible to split the array, and false otherwise.
*/

// Runtime: 2ms (Beats 72.61%) | Memory: 42.36MB (Beats 92.60%)

// Array, Hash Table, Counting

// Solution: https://leetcode.com/problems/split-the-array/solutions/4838431/runtime-beats-72-memory-beats-92-explained-3-lines-solution


class Solution {
    public boolean isPossibleToSplit(int[] nums) {
        Arrays.sort(nums);
        for (int i=0; i<nums.length-2; i++){
            if (nums[i] == nums[i+1] && nums[i+1] == nums[i+2]) return false;
        }
        return true;
    }
}
