/*
You are given a positive integer array nums.
The element sum is the sum of all the elements in nums.
The digit sum is the sum of all the digits (not necessarily distinct) that appear in nums.
Return the absolute difference between the element sum and digit sum of nums.
Note that the absolute difference between two integers x and y is defined as |x - y|.
*/

// Runtime: 2ms (Beats 98.66%) | Memory: 45.26MB (Top 7.58%)

// Arrays, Math

// Solution: https://leetcode.com/problems/difference-between-element-sum-and-digit-sum-of-an-array/solutions/4649442/beats-98-6-users-brute-force-approach-easy-explanation-working


class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;

        for (int i : nums){
            element_sum += i;           // Addition of all elements in Array.
            while (i!=0){
                digit_sum += i % 10;            // Addition of all the digits of elements in Array.
                i/=10;
            }
        }
        return Math.abs(element_sum - digit_sum);
    }
}
