Find the Nth Root of M

Problem

Given two integers "n" and "m", find the integer "x" such that "xⁿ = m". If an integer root does not exist, return "-1".

Problem Link

"GeeksforGeeks – Find Nth Root of M" (https://www.geeksforgeeks.org/problems/find-nth-root-of-m5843/1)

Example 1

Input:

n = 3, m = 27

Output:

3

Explanation: (3^3 = 27), so the cube root of 27 is 3.

Example 2

Input:

n = 2, m = 8

Output:

-1

Explanation: No integer squared equals 8.

Approach

- Use Binary Search to search for the possible root.
- Set "low = 1" and "high = m" for positive "m".
- Calculate "mid" raised to the power "n", stopping early if it exceeds "m".
- If the result equals "m", return "mid".
- If the result is less than "m", search the right half.
- If the result is greater than "m", search the left half.
- If no integer root exists, return "-1".

Edge Cases

- If "m == 1", return "1".
- If "n == 1", return "m".
- If "m == 0" and "n > 0", return "0".
- Handle overflow when calculating powers.

Complexity Analysis

- Time Complexity: O(n log m) with a power check that takes up to O(n) operations per binary-search step.
- Space Complexity: O(1)

Topic

Binary Search on Answers

Language

Java