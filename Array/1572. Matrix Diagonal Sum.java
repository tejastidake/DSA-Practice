/*
Given a square matrix mat, return the sum of the matrix diagonals.
Only include the sum of all the elements on the primary diagonal and all the elements on the secondary diagonal that are not part of the primary diagonal.
*/

// Runtime: 0ms (Beats 100%) | Memory: 44.30MB (Beats 51.12%)

// Array, Matrix

// Solution: https://leetcode.com/problems/matrix-diagonal-sum/solutions/4789611/optimized-5-lines-solution-beats-100-explained-fully


class Solution {
    public int diagonalSum(int[][] mat) {
        int sum = 0;
        for (int i=0; i<mat.length; i++){
            sum += mat[i][i];
            sum += mat[i][mat.length-i-1];
        }
        return (mat.length % 2 == 0) ? sum : sum-(mat[mat.length/2][mat.length/2]);
    }
}
