/*
Given an array nums of integers, return how many of them contain an even number of digits.
*/

// Runtime: 1ms (Beats 98.30%) | Memory: 42.6MB (Top 59.70%)

class Solution {
    public int findNumbers(int[] nums) {
        int even = 0;
        for (int i : nums){
            int a = 0;
            while (i!=0){
                i/=10;
                a++;
            }
            if (a%2==0) even++;
        }
        return even;
    }
}
