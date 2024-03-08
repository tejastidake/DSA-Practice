/*
Given a 0-indexed m x n integer matrix matrix, create a new 0-indexed matrix called answer. Make answer equal to matrix, then replace each element with the value -1 with the maximum element in its respective column.

Return the matrix answer.
*/

// Runtime: 1ms (Beats 100%) | Memory: 45.16MB (Beats 94.54%)

// Array, Matrix

// Solution: https://leetcode.com/problems/modify-the-matrix/solutions/4840637/beats-100-in-time-space-o-1-space-complexity-solution-explained


class Solution {
    public int[][] modifiedMatrix(int[][] matrix) {
        int maxCol = Integer.MIN_VALUE;

        for (int i=0; i<matrix[0].length; i++){
            for (int j=0; j<matrix.length; j++){
                if (matrix[j][i] > maxCol) maxCol = matrix[j][i];
            }
            for (int j=0; j<matrix.length; j++){
                if (matrix[j][i] == -1) matrix[j][i] = maxCol;
            }
            maxCol = Integer.MIN_VALUE;
        }


        return matrix;
    }
}
