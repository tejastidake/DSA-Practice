/*
You are given an array of integers nums of length n.
The cost of an array is the value of its first element. For example, the cost of [1,2,3] is 1 while the cost of [3,4,1] is 3.
You need to divide nums into 3 disjoint contiguous subarrays.

Return the minimum possible sum of the cost of these subarrays.
*/

// Runtime: 2ms (Beats 47.17%) | Memory: 43.64MB (Beats 95.80%)

// Array, Sorting, Enumeration

// Solution: https://leetcode.com/problems/divide-an-array-into-subarrays-with-minimum-cost-i/solutions/4862238/easy-4-lines-solution


class Solution {
    public int minimumCost(int[] nums) {
        
        int first = nums[0];
        nums[0]=50;
        Arrays.sort(nums);

        return first + nums[0] + nums[1];
    }
}
