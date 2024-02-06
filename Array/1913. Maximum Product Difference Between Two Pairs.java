/*
The product difference between two pairs (a, b) and (c, d) is defined as (a * b) - (c * d).
For example, the product difference between (5, 6) and (2, 7) is (5 * 6) - (2 * 7) = 16.
Given an integer array nums, choose four distinct indices w, x, y, and z such that the product difference between pairs (nums[w], nums[x]) and (nums[y], nums[z]) is maximized.
Return the maximum such product difference.
*/

// Runtime: 7ms (Beats 56.05%) | Memory: 45.28MB (Beats 5.45%)

// Array, Sorting

// Solution: https://leetcode.com/problems/maximum-product-difference-between-two-pairs/solutions/4686976/easiest-2-lines-answer-o-1-space-explained


class Solution {
    public int maxProductDifference(int[] nums) {
        Arrays.sort(nums);              // sorts the array in Ascending (Increasing) Order.
        return (nums[nums.length-1] * nums[nums.length-2]) - (nums[0] * nums[1]);               // return maximum product difference
    }
}
