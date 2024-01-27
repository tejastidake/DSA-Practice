/*
You are given a 0-indexed integer array nums of even length and there is also an empty array arr. Alice and Bob decided to play a game where in every round Alice and Bob will do one move. The rules of the game are as follows:

Every round, first Alice will remove the minimum element from nums, and then Bob does the same.
Now, first Bob will append the removed element in the array arr, and then Alice does the same.
The game continues until nums becomes empty.
Return the resulting array arr.
*/

// Array, Sorting, Heap (Priority Queue), Simulation

// Runtime: 2ms (Beats 98.79%) | Memory: 44.92MB (Top 39.16%)

class Solution {
    public int[] numberGame(int[] nums) {
        int[]  arr  = new int[nums.length];            // arr for returning answer
        Arrays.sort(nums);                            // sorting the given array for easy retrival

        for   (int  i=0;i<nums.length;i+=2){          // increasing i by 2 for alice and bob
            arr[i] = nums[i+1];                      // alice will pick first and put after bob
            arr[i+1]  = nums[i];                     // bob will pick second and put before alice
        }

        return arr;                                 // returning the answer arr
        
    }
}
