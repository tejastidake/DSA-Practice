/*
Given the array nums, for each nums[i] find out how many numbers in the array are smaller than it. That is, for each nums[i] you have to count the number of valid j's such that j != i and nums[j] < nums[i].
Return the answer in an array.
*/

// Runtime: 11ms (Beats 22.20%) | Memory: 44.28MB (Top 49.74%)

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] arr = new int[nums.length];          // Final array to return
        short sum = 0;                    // keep track of how many smaller numbers
        for (short i=0; i<nums.length; i++){
            sum=0;                    // set to 0, for each new variable
            for (short j=0; j<nums.length; j++){
                if (i!=j){
                    if (nums[i] > nums[j]) sum++;          // check each element and sum++ if nums[i] > nums[j]
                }
            }
            arr[i]=sum;
        }
        return arr;
    }
}
