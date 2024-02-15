/*
You are given an array of positive integers nums of length n.
A polygon is a closed plane figure that has at least 3 sides. The longest side of a polygon is smaller than the sum of its other sides.
Conversely, if you have k (k >= 3) positive real numbers a1, a2, a3, ..., ak where a1 <= a2 <= a3 <= ... <= ak and a1 + a2 + a3 + ... + ak-1 > ak, then there always exists a polygon with k sides whose lengths are a1, a2, a3, ..., ak.
The perimeter of a polygon is the sum of lengths of its sides.
Return the largest possible perimeter of a polygon whose sides can be formed from nums, or -1 if it is not possible to create a polygon.
*/

// Runtime: 30ms (Beats 30.37%) | Memory: 56.18MB (Beats 82.29%)

// Array, Greedy, Sorting, Prefix Sum

// Solution: https://leetcode.com/problems/find-polygon-with-the-largest-perimeter/solutions/4732699/easy-solution


class Solution {
    public long largestPerimeter(int[] nums) {
        Arrays.sort(nums);

        long sum = 0;
        long ans = -1;

        for (int i=0; i<nums.length; i++){
            if (nums[i] < sum){
                ans = sum + nums[i];
            }
            sum+=nums[i];
        }
        
        return ans;
    }
}
