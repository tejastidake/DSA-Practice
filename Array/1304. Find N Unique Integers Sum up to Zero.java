/*
Given an integer n, return any array containing n unique integers such that they add up to 0.
*/

// Runtime: 0ms (Beats 100%) | Memory: 41.29MB (Beats 92.21%)

// Arrray, Math

// Solution: https://leetcode.com/problems/find-n-unique-integers-sum-up-to-zero/solutions/4775560/top-1-in-time-and-space-easy-solution-with-explanation


class Solution {
    public int[] sumZero(int n) {
        int[] ans = new int[n];
        
            for (int i=0; i<n; i+=2){
                if (i==n-1 && i%2==0) return ans;
                ans[i] = i+1;
                ans[i+1] = (i+1)*-1;
            }

        return ans;
    }
}
