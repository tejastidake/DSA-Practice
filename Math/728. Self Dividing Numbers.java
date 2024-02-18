/*
A self-dividing number is a number that is divisible by every digit it contains.

For example, 128 is a self-dividing number because 128 % 1 == 0, 128 % 2 == 0, and 128 % 8 == 0.
A self-dividing number is not allowed to contain the digit zero.

Given two integers left and right, return a list of all the self-dividing numbers in the range [left, right].
*/

// Runtime: 1ms (Beats 100%) | Memory: 41.39MB (Beats 28.06%)

// Math

// Solution: https://leetcode.com/problems/self-dividing-numbers/solutions/4745706/top-1-beats-100-solution-with-explanation


class Solution {
    public static boolean checkSD(int num){
        int temp = num;
        while (num>0){
            if ((num%10 == 0) || temp % (num%10) != 0){
                return false;
            }
            num/=10;
        }
        return true;
    }
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> li = new ArrayList<>();
        while (left<=right){
            if (checkSD(left)) li.add(left);
            left++;
        }
        return li;
    }
}
