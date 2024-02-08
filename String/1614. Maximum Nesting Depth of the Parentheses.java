/*
A string is a valid parentheses string (denoted VPS) if it meets one of the following:

It is an empty string "", or a single character not equal to "(" or ")",
It can be written as AB (A concatenated with B), where A and B are VPS's, or
It can be written as (A), where A is a VPS.
We can similarly define the nesting depth depth(S) of any VPS S as follows:

depth("") = 0
depth(C) = 0, where C is a string with a single character not equal to "(" or ")".
depth(A + B) = max(depth(A), depth(B)), where A and B are VPS's.
depth("(" + A + ")") = 1 + depth(A), where A is a VPS.
For example, "", "()()", and "()(()())" are VPS's (with nesting depths 0, 1, and 2), and ")(" and "(()" are not VPS's.

Given a VPS represented as string s, return the nesting depth of s.
*/

// Runtime: 1ms (Beats 42.76%) | Memory: 42.45MB (Beats 9.47%)

// String, Stack

// Solution: https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/solutions/4697812/solution-1ms


class Solution {
    public int maxDepth(String s) {
        int ans = 0;
        int count = 0;
        for (int i=0; i<s.toCharArray().length; i++){
            if (s.charAt(i) == '(') count++;
            else if (s.charAt(i) == ')') count --;

            ans = Math.max(ans, count);
        }
        return ans;
    }
}
