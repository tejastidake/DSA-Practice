/*
Given a string s, reverse the order of characters in each word within a sentence while still preserving whitespace and initial word order.
*/

// Runtime: 296ms (Beats 5.39%) | Memory: 47.04MB (Top 5.77%)

// Two Pointers, String


class Solution {
    public String reverseWords(String s) {
        String ans = "";
        String[] words = s.split(" ");
        for (int i=0; i<words.length; i++){
            char[] ch = words[i].toCharArray();
            for (int j=ch.length-1; j>=0; j--){
                ans+=ch[j];
                
            }
            
            if (i!=words.length-1) ans+=" ";
        }
        return ans;
    }
}
