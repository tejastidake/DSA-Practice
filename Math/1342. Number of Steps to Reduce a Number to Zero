/*
Given an integer num, return the number of steps to reduce it to zero.
In one step, if the current number is even, you have to divide it by 2, otherwise, you have to subtract 1 from it.
*/

// Runtime: 0ms (Top 100%) | Memory: 40.25MB (Top 44.88%)

class Solution {
    public int numberOfSteps(int num) {
        int step = 0;
        while (num!=0){
            step++;
            if (num%2==0) num/=2;
            else num-=1;
        }
        return  step;
    }
}
