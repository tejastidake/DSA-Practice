/*
You are given a 0-indexed string s typed by a user. Changing a key is defined as using a key different from the last used key. For example, s = "ab" has a change of a key while s = "bBBb" does not have any.
Return the number of times the user had to change the key.
Note: Modifiers like shift or caps lock won't be counted in changing the key that is if a user typed the letter 'a' and then the letter 'A' then it will not be considered as a changing of key.
*/

// Runtime: 1ms (Beats 100%) | Memory: 41.90MB (Top 100%)

// String

// Solution: https://leetcode.com/problems/number-of-changing-keys/solutions/4641638/beats-100-in-time-and-space-top-1-straight-forward-easiest-solution

class Solution {
    public int countKeyChanges(String s) {
        int  ans =  0;
        char[] arr = s.toCharArray();
        
        for (int i=0; i<arr.length-1; i++){
            
            if (arr[i]!=arr[i+1] && arr[i]!=((char)((int)arr[i+1]+32)) && arr[i]!=((char)((int)arr[i+1]-32))) ans++;      // condition to increase ans by 1 if condition satisfied for all elements of array
        }
        
        return ans;
    }
}
