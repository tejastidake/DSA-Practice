/*
There is a biker going on a road trip. The road trip consists of n + 1 points at different altitudes. The biker starts his trip on point 0 with altitude equal 0.
You are given an integer array gain of length n where gain[i] is the net gain in altitude between points i​​​​​​ and i + 1 for all (0 <= i < n). Return the highest altitude of a point.
*/

// Runtime: 2ms (Beats 5.54%) | Memory: 41.37MB (Beats 31.73%)

// Array, Prefix Sum

// Solution: https://leetcode.com/problems/find-the-highest-altitude/solutions/4707164/easy-solution-explained


class Solution {
    public int largestAltitude(int[] gain) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(0);

        for (int i=0; i<gain.length; i++){
            arr.add(arr.get(i) + gain[i]);
        }

        Collections.sort(arr);

        return arr.get(arr.size()-1);
    }
}
