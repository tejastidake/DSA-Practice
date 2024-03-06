/*
You are given an array of strings names, and an array heights that consists of distinct positive integers. Both arrays are of length n.
For each index i, names[i] and heights[i] denote the name and height of the ith person.

Return names sorted in descending order by the people's heights.
*/

// Runtime: 27ms (Beats 17.05%) | Memory: 45.24MB (Beats 63.19%)

// Array, String, Hash Table, Sorting


class Solution {
    public String[] sortPeople(String[] names, int[] heights) {
        
        int n = heights.length-1;

        while (n>0){
            for (int i=0; i<n; i++){
            
                if (heights[i] < heights[i+1]){
                    int temp1 = heights[i];
                    heights[i] = heights[i+1];
                    heights[i+1] = temp1;

                    String temp2 = names[i];
                    names[i] = names[i+1];
                    names[i+1] = temp2;
                }
            }
            n--;
        }

        return names;
    }
}
