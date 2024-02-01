/*
Given two arrays of integers nums and index. Your task is to create target array under the following rules:
Initially target array is empty.
From left to right read nums[i] and index[i], insert at index index[i] the value nums[i] in target array.
Repeat the previous step until there are no elements to read in nums and index.
Return the target array.
It is guaranteed that the insertion operations will be valid.
*/

// Runtime: 2ms (Beats 9.86%) | Memory: 41.81MB (Top 29.47%)

// Array, Simulation

// Solution: https://leetcode.com/problems/create-target-array-in-the-given-order/solutions/4660220/java-straight-forward-brute-force-approch


class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> arr = new ArrayList<>();
        for (int i=0; i<nums.length; i++){
            arr.add(index[i],nums[i]);
        }
        return arr.stream().mapToInt(i->i).toArray();
    }
}
