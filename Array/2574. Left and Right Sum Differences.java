/*
Given a 0-indexed integer array nums, find a 0-indexed integer array answer where:

answer.length == nums.length.
answer[i] = |leftSum[i] - rightSum[i]|.
Where:

leftSum[i] is the sum of elements to the left of the index i in the array nums. If there is no such element, leftSum[i] = 0.
rightSum[i] is the sum of elements to the right of the index i in the array nums. If there is no such element, rightSum[i] = 0.
Return the array answer.
*/

// Runtime: 23ms (Beats 5.51%) | Memory: 44.63MB (Top 31.92%)

class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] ans = new int[nums.length];
        
        for (int i=0; i<nums.length; i++){
            int lsum = 0;
            int rsum = 0;
            if (i==0){
                for (int j=1; j<nums.length; j++){
                    rsum+=nums[j];
                }
            }
            else if(i==nums.length-1){
                for (int j=0; j<nums.length-1; j++){
                    lsum+=nums[j];
                }
            }
            else{
                for (int j=0; j<nums.length; j++){
                    if (j<i) lsum+=nums[j];
                    else if (j>i) rsum+=nums[j];
                }
            }
            ans[i] = Math.abs(lsum-rsum);
        }
        return ans;
    }
}
