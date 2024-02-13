/*
Given an array of strings patterns and a string word, return the number of strings in patterns that exist as a substring in word.
A substring is a contiguous sequence of characters within a string.
*/

// Runtime: 0ms (Beats 100%) | Memory: 42.02MB (Beats 27.88%)

// String

// Solution: https://leetcode.com/problems/number-of-strings-that-appear-as-substrings-in-word/solutions/4718178/top-1-beats-100-with-full-explanation-easy-just-3-lines-solution-0-ms


class Solution {
    public int numOfStrings(String[] patterns, String word) {
        int ans = 0;
        for (String st : patterns) if (word.contains(st)) ans++;
        return ans;
    }
}
