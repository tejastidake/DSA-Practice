/*
You are given a string s, where every two consecutive vertical bars '|' are grouped into a pair. In other words, the 1st and 2nd '|' make a pair, the 3rd and 4th '|' make a pair, and so forth.
Return the number of '*' in s, excluding the '*' between each pair of '|'.
Note that each '|' will belong to exactly one pair.
*/

// Runtime: 1ms (Beats 100%) | Memory: 41.64MB (Beats 35.62%)

// String

// Solution: https://leetcode.com/problems/count-asterisks/solutions/4763610/solution-beats-100-of-users-top-1-easy


class Solution {
    public int countAsterisks(String s) {
        
        char[] arr = s.toCharArray();

        int ans = 0;

        int count = 0;

        for (char a : arr){
            if (count == 0){
                if (a=='*') ans++;
            }
            if (a == '|') {
                if (count == 0) count = 1;
                else count = 0;
            }
        }

        return ans;
        
    }
}
