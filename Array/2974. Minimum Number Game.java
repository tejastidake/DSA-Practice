/*
You are given a 0-indexed integer array nums of even length and there is also an empty array arr. Alice and Bob decided to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:

Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
Now, first Bob will append the removed element in the array arr, and then Alice does the same.
The game continues until nums becomes empty.
Return the resulting array arr.
*/

// Runtime: 2ms (Beats 98.79%) | Memory: 44.92MB (Top 39.16%)

class Solution {
    public int[] numberGame(int[] nums) {
        int[]  arr  = new int[nums.length];
        Arrays.sort(nums);

        for   (int  i=0;i<nums.length;i+=2){
            arr[i] = nums[i+1];
            arr[i+1]  = nums[i];
        }

        return arr;
        
    }
}
