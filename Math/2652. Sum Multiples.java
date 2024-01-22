/*
Given a positive integer n, find the sum of all integers in the range [1, n] inclusive that are divisible by 3, 5, or 7.
Return an integer denoting the sum of all numbers in the given range satisfying the constraint.
*/

// Runtime: 3ms (Top 72.13%) | Memory: 40.77MB (Top 39.62%)

class Solution {
    public int sumOfMultiples(int n) {
        int sum = 0;          // Initializing Variable sum to take count
        for (int i=1; i<=n; i++){
            if (((i%3)==0) || ((i%5)==0) || ((i%7)==0)){          // checking if the i is divisible by 3 or 5 or 7
                sum+=i;
            }
        }
        return sum;
    }
}
