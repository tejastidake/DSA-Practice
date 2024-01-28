/*
You are given a string word containing distinct lowercase English letters.
Telephone keypads have keys mapped with distinct collections of lowercase English letters, which can be used to form words by pushing them. For example, the key 2 is mapped with ["a","b","c"], we need to push the key one time to type "a", two times to type "b", and three times to type "c" .
It is allowed to remap the keys numbered 2 to 9 to distinct collections of letters. The keys can be remapped to any amount of letters, but each letter must be mapped to exactly one key. You need to find the minimum number of times the keys will be pushed to type the string word.
Return the minimum number of pushes needed to type word after remapping the keys.

Note that 1, *, #, and 0 do not map to any letters.
*/

// Runtime: 0ms (Beats 100%) | Memory: 42.03MB (Top 30.44%)

// Math, String, Greedy

// Solution: https://leetcode.com/problems/minimum-number-of-pushes-to-type-word-i/solutions/4637459/beats-100-top-1-full-explanation

class Solution {
    public int minimumPushes(String word) {
        int len = word.length();
        int ans = 0;
        int count = 1;
        
        while (len >= 1){
            
            if (len >= 8){
                len -= 8;
                ans += count*8;
                count++;
            }
            
            else if (len < 8 && len > 0){
                ans += len*count;
                len = 0;
            }
        }
        
        return ans;
        
    }
}
