/*
You are given a 0-indexed string array words.

Let's define a boolean function isPrefixAndSuffix that takes two strings, str1 and str2:
isPrefixAndSuffix(str1, str2) returns true if str1 is both a prefix and a suffix of str2, and false otherwise.

For example, isPrefixAndSuffix("aba", "ababa") is true because "aba" is a prefix of "ababa" and also a suffix, but isPrefixAndSuffix("abc", "abcd") is false.
Return an integer denoting the number of index pairs (i, j) such that i < j, and isPrefixAndSuffix(words[i], words[j]) is true.
*/

// Runtime: 2ms (Beats 99.57%) | Memory: 41.50MB (Beats 98.82%)

// Array, String, Trie, Rolling Hash, String Matching, Hash Function

// Solution: https://leetcode.com/problems/count-prefix-and-suffix-pairs-i/solutions/4833259/beats-100-in-time-space


class Solution {
    public int countPrefixSuffixPairs(String[] words) {

        int ans = 0;
        for (int i=0; i<words.length-1; i++){
            for (int j=i+1; j<words.length; j++){
                if (words[j].startsWith(words[i]) && words[j].endsWith(words[i])) ans++;
            }
        }

        return ans;

    }
}
