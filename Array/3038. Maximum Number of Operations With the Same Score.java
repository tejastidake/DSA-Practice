/*
Given an array of integers called nums, you can perform the following operation while nums contains at least 2 elements:

Choose the first two elements of nums and delete them.
The score of the operation is the sum of the deleted elements.

Your task is to find the maximum number of operations that can be performed, such that all operations have the same score.
Return the maximum number of operations possible that satisfy the condition mentioned above.
*/

// Runtime: 0ms (Beats 100%) | Memory: 41.99MB (Beats 34.62%)

// Array, Simulation

// Solution: https://leetcode.com/problems/maximum-number-of-operations-with-the-same-score-i/solutions/4778889/top-1-beats-100-explained-question-answer


class Solution {
    public int maxOperations(int[] nums) {
        int score = nums[0]+nums[1];
        int ans = 1;
            for (int i=2; i<nums.length-1; i+=2){
                if ((nums[i]+nums[i+1]) == score) ans++;
                else return ans;
            }
        
        return ans;
    }
}
