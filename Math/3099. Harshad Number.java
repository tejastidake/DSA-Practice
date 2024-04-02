/*
An integer divisible by the sum of its digits is said to be a Harshad number. You are given an integer x. Return the sum of the digits of x if x is a Harshad number, otherwise, return -1.
*/

// Runtime: 0ms (Beats 100%) | Memory: 40.03MB (Beats 90.40%)

// Math

// Solution: https://leetcode.com/problems/harshad-number/solutions/4960235/runtime-100-memory-90-step-by-step-explained-fully-optimized-easiest


class Solution {
    public int sumOfTheDigitsOfHarshadNumber(int x) {
        int sum = 0;
        int temp = x;
        while (temp!=0){
            sum+=temp%10;
            temp/=10;
        }
        if (x%sum == 0) return sum;
        return -1;
    }
}
