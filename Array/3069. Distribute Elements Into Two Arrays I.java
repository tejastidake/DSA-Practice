/*
You are given a 1-indexed array of distinct integers nums of length n.
You need to distribute all the elements of nums between two arrays arr1 and arr2 using n operations. In the first operation, append nums[1] to arr1. In the second operation, append nums[2] to arr2. Afterwards, in the ith operation:

If the last element of arr1 is greater than the last element of arr2, append nums[i] to arr1. Otherwise, append nums[i] to arr2.
The array result is formed by concatenating the arrays arr1 and arr2. For example, if arr1 == [1,2,3] and arr2 == [4,5,6], then result = [1,2,3,4,5,6].

Return the array result.
*/

// Runtime: 1ms (Beats 100%) | Memory: 44.24MB (Beats 100%)

// Array

// Solution: https://leetcode.com/problems/distribute-elements-into-two-arrays-i/solutions/4820158/beats-100-in-space-and-time-top-1


class Solution {
    public int[] resultArray(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();

        arr1.add(nums[0]);
        arr2.add(nums[1]);

        int a=2;
        while (a<nums.length){
            if ((arr1.get(arr1.size()-1)) > (arr2.get(arr2.size()-1))) arr1.add(nums[a]);
            else arr2.add(nums[a]);
            a++;
        }

        int count = 0;

        for (int i=0; i<arr1.size(); i++) {
            nums[count] = arr1.get(i);
            count++;
        }
        for (int i=0; i<arr2.size(); i++){
            nums[count] = arr2.get(i);
            count++;
        }


        return nums;
    }
}
