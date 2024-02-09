/*
You are given a positive integer num consisting only of digits 6 and 9.
Return the maximum number you can get by changing at most one digit (6 becomes 9, and 9 becomes 6).
*/

// Runtime: 1ms (Beats 60.71%) | Memory: 40.27MB (Beats 66.20%)

// Math, Greedy

// Solution: https://leetcode.com/problems/maximum-69-number/solutions/4702674/solution-1ms-easy-explained



class Solution {
    public int maximum69Number (int num) {
        ArrayList<Integer> arr = new ArrayList<>();
        while (num > 0){
            arr.add(num%10);
            num/=10;
        }
        
        Collections.reverse(arr);

        int ans = 0;
        for (int i=0; i<arr.size(); i++){
            if (arr.get(i) == 6){
                arr.set(i,9);
                ans = 0;
                for (int j=0; j<arr.size(); j++){
                    ans *= 10;
                    ans += arr.get(j);
                }
                return ans;
            }
            else{
                ans *= 10;
                ans += arr.get(i);
            }
        }
        return ans;
    }
}
