/*
You are given an integer array pref of size n. Find and return the array arr of size n that satisfies:

pref[i] = arr[0] ^ arr[1] ^ ... ^ arr[i].
Note that ^ denotes the bitwise-xor operation.

It can be proven that the answer is unique.
*/

// Runtime: 2ms (Beats 88.89%) | Memory: 64.57MB (Beats 12.90%)

// Array, Bit Manipulation

// Solution: https://leetcode.com/problems/find-the-original-array-of-prefix-xor/solutions/4735224/top-10-beats-90-2-lines-solution-optimized


class Solution {
    public int[] findArray(int[] pref) {
        
        for (int i=pref.length-1; i>0; i--) {
            pref[i] = pref[i] ^ pref[i-1];
        }
        
        return pref;

    }
}
