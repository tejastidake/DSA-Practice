/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.
*/

// Runtime: 2ms (Beats 73.94%) | Memory: 54.82MB (Beats 19.06%)

// Array, Prefix Sum

// Solution: https://leetcode.com/problems/product-of-array-except-self/solutions/4877721/beats-75-o-n-time-space-question-explained


class Solution {
    public int[] productExceptSelf(int[] nums) {

        int n = nums.length;
        int leftProduct[] = new int[n];
        int rightProduct[] = new int[n];

        int ans[] = new int[n];


        leftProduct[0] = 1;
        rightProduct[n-1] = 1;
        
        for (int i=1; i<n; i++){
            leftProduct[i] = leftProduct[i-1] * nums[i-1];
            rightProduct[n-i-1] = rightProduct[n-i] * nums[n-i];
        }

        for (int i=0; i<n; i++){
            ans[i] = leftProduct[i] * rightProduct[i];
        }

        return ans;


    }
}
