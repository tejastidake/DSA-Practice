/*
You are given a positive integer arrivalTime denoting the arrival time of a train in hours, and another positive integer delayedTime denoting the amount of delay in hours.
Return the time when the train will arrive at the station.
Note that the time in this problem is in 24-hours format.
*/

// Runtime: 0ms (Beats 100%) | Memory: 40.26MB (Beats 89.94%)

// Math

// Solution: https://leetcode.com/problems/calculate-delayed-arrival-time/solutions/4740510/top-1-beats-100-3-lines-code-fully-explained


class Solution {
    public int findDelayedArrivalTime(int arrivalTime, int delayedTime) {

        int time = arrivalTime+delayedTime;
        while (time>24) time-=24;
        
        return ((time)==24) ? 0 : time;
        

    }
}
