/*
Given an array of strings words, return the first palindromic string in the array. If there is no such string, return an empty string "".
A string is palindromic if it reads the same forward and backward.
*/

// Runtime: 4ms (Beats 40.56%) | Memory: 45.06MB (Beats 39.19%)

// Array, Two Pointers, String

// Solution: https://leetcode.com/problems/find-first-palindromic-string-in-the-array/solutions/4722786/easy-3-lines-solution



class Solution {
    public String firstPalindrome(String[] words) {

        for (String S : words){
            StringBuilder st = new StringBuilder(S);

            if (st.reverse().toString().equals(S)) return S;

        }

        return "";
        
    }
}
