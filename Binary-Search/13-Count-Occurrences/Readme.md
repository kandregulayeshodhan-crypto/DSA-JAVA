Number of Occurrence

- Platform: GeeksforGeeks
- Problem Link: https://www.geeksforgeeks.org/problems/number-of-occurrence2259/1

Problem Statement

Given a sorted array "arr[]" and an integer "target", find the number of occurrences of the target in the array.

Examples

Example 1

Input: "arr[] = [1, 1, 2, 2, 2, 2, 3], target = 2"

Output: "4"

Explanation: The target 2 occurs four times.

Example 2

Input: "arr[] = [1, 1, 2, 2, 2, 2, 3], target = 4"

Output: "0"

Explanation: The target 4 is not present in the array.

Approach: Binary Search

1. Find the first occurrence of the target.

2. Find the last occurrence of the target.

3. If the target is absent, return 0.

4. Otherwise, calculate:
   
   "count = last - first + 1"

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Concept

Count occurrences using two binary searches: first occurrence and last occurrence.
