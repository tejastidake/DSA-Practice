/*
Your laptop keyboard is faulty, and whenever you type a character 'i' on it, it reverses the string that you have written. Typing other characters works as expected.
You are given a 0-indexed string s, and you type each character of s using your faulty keyboard.
Return the final string that will be present on your laptop screen.
*/

// Runtime: 19ms (Beats 9.61%) | Memory: 45.53MB (Beats 6.53%)

// String, Simulation


class Solution {
    public String finalString(String s) {
        String ans = "";
        char[] chArr = s.toCharArray();

        for (char ch : chArr){
            if (ch=='i'){
                char[] arr = ans.toCharArray();
                ans = "";
                for (int i=0; i<arr.length; i++){
                    ans += arr[arr.length-i-1];
                }
            }
            else {
                ans+=ch;
            }
        }
        return ans;
    }
}
