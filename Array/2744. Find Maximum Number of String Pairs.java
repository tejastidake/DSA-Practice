/*
You are given a 0-indexed array words consisting of distinct strings.
The string words[i] can be paired with the string words[j] if:

The string words[i] is equal to the reversed string of words[j].
0 <= i < j < words.length.
Return the maximum number of pairs that can be formed from the array words.

Note that each string can belong in at most one pair.
*/

// Runtime: 1ms (Beats 100%) | Memory: 41.98MB (Beats 93.71%)

// Array, Hash Table, String, Simulation

// Solution: https://leetcode.com/problems/find-maximum-number-of-string-pairs/solutions/4798292/top-1-runtime-beats-100-memory-beats-93-71-explained


class Solution {
    public int maximumNumberOfStringPairs(String[] words) {
        int ans = 0;
        for (int i=0; i<words.length-1; i++){
            
            for (int j=i+1; j<words.length; j++){
                if ((words[i].charAt(0) == words[j].charAt(1)) && words[i].charAt(1) == words[j].charAt(0)) ans++;
            }

        }
        return ans;
    }
}
