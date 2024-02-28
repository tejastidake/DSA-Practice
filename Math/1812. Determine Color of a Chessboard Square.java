/*
You are given coordinates, a string that represents the coordinates of a square of the chessboard. Below is a chessboard for your reference.
Return true if the square is white, and false if the square is black.

The coordinate will always represent a valid chessboard square. The coordinate will always have the letter first, and the number second.
*/

// Runtime: 0ms (Beats 100%) | Memory: 41.06MB (Beats 79.64%)

// Math, String

// Solution: https://leetcode.com/problems/determine-color-of-a-chessboard-square/solutions/4793382/easiest-optimized-top-1-beats-100-o-1-time-space-fully-explained-1-line-solution


class Solution {
    public boolean squareIsWhite(String coordinates) {
        return (((int)coordinates.charAt(0) + (int)coordinates.charAt(1)) % 2 == 0) ? false : true;
    }
}
