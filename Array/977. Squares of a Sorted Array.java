/*
Given an integer array nums sorted in non-decreasing order, return an array of the squares of each number sorted in non-decreasing order.
*/

// Runtime: 7ms (Beats 41.41%) | Memory: 46.9MB (Top 43.87%)

class Solution {
    public int[] sortedSquares(int[] nums) {
        int[] arr = new int[nums.length];
        for (int i=0; i<nums.length; i++){
            arr[i] = nums[i]*nums[i];
        }
        Arrays.sort(arr);
        return arr;
    }
}
