/*
You are given an array apple of size n and an array capacity of size m.
There are n packs where the ith pack contains apple[i] apples. There are m boxes as well, and the ith box has a capacity of capacity[i] apples.
Return the minimum number of boxes you need to select to redistribute these n packs of apples into boxes.
Note that, apples from the same pack can be distributed into different boxes.
*/

// Runtime: 1ms (Beats 100%) | Memory: 42.03MB (Beats 100%)

// Array

// Solution: https://leetcode.com/problems/apple-redistribution-into-boxes/solutions/4853981/beats-100-in-space-time-both-easy


class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {

        Arrays.sort(capacity);
        int sum = 0;
        for (int i : apple) sum+=i;
        
        int count = 0;
        int i = 0;

        while (i < capacity.length && sum > count) {
            count += capacity[capacity.length-1-i];
            i++;
        }

        return i;
    }
}
