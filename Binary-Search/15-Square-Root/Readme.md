69. Sqrt(x)

- Platform: LeetCode
- Problem ID: 69
- Difficulty: Easy
- Problem Link: https://leetcode.com/problems/sqrtx/

Problem Statement

Given a non-negative integer "x", return the square root of "x" rounded down to the nearest integer.

The returned integer should be non-negative as well.

You must not use any built-in exponent function or operator.

Examples

Example 1

Input: "x = 4"

Output: "2"

Explanation: The square root of 4 is 2.

Example 2

Input: "x = 8"

Output: "2"

Explanation: The square root of 8 is approximately 2.828. Rounding it down gives 2.

Constraints

- "0 <= x <= 2^31 - 1"

Approach: Binary Search

1. Initialize "low = 0" and "high = x".
2. Calculate "mid = low + (high - low) / 2".
3. If "mid * mid <= x", store "mid" as the answer and search the right half.
4. Otherwise, search the left half.
5. Return the answer.

Overflow Note: Use "mid <= x / mid" when "mid" is nonzero, or cast to "long" before multiplying, to avoid integer overflow.

Complexity Analysis

- Time Complexity: O(log x)
- Auxiliary Space: O(1)

Key Concept

Find the largest integer whose square is less than or equal to "x".
