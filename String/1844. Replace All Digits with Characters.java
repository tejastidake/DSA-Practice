/*
You are given a 0-indexed string s that has lowercase English letters in its even indices and digits in its odd indices.
There is a function shift(c, x), where c is a character and x is a digit, that returns the xth character after c.
For example, shift('a', 5) = 'f' and shift('x', 0) = 'x'.
For every odd index i, you want to replace the digit s[i] with shift(s[i-1], s[i]).
Return s after replacing all digits. It is guaranteed that shift(s[i-1], s[i]) will never exceed 'z'.
*/

// Runtime: 5ms (Beats 23.48%) | Memory: 42.16MB (Beats 14.23%)

// String

// Solution: https://leetcode.com/problems/replace-all-digits-with-characters/solutions/4710206/easy-simple-solution


class Solution {
    public String replaceDigits(String s) {
        char[] cArr = s.toCharArray();

        String ans = "";
        for (int i=0; i<cArr.length; i++){
            if (i%2 != 0){
                int a = cArr[i-1] + (cArr[i]-'0');
                char b = (char)a;
                cArr[i] = b;
            }
            ans+=cArr[i];
        }

        return ans;

    }
}
