/*
Given an integer num, return the number of digits in num that divide num.
An integer val divides nums if nums % val == 0.
*/

// Runtime: 0ms (Beats 100%) | Memory: 40.25MB (Top 47.99%)

// Math

// Solution: https://leetcode.com/problems/count-the-digits-that-divide-a-number/solutions/4681617/top-1-beats-100-with-explanation-easy


class Solution {
    public int countDigits(int num) {
        int ans=0;
        int n = num;

        while (num>0){
            int rem = num%10;
            num/=10;
            if (n%rem == 0) ans++;            
        }
        
        return ans;
    }
}
