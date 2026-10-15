Floor in a Sorted Array

- Platform: GeeksforGeeks
- Problem Link: https://www.geeksforgeeks.org/problems/floor-in-a-sorted-array-1587115620/1
- Difficulty: Easy

Problem Statement

Given a sorted array "arr[]" and an integer "x", find the index (0-based) of the largest element in the array that is less than or equal to "x".

If no such element exists, return "-1".

Examples

Example 1

Input: "arr[] = [1, 2, 8, 10, 10, 12, 19], x = 5"

Output: "1"

Explanation: The largest element less than or equal to 5 is 2, which is at index 1.

Example 2

Input: "arr[] = [1, 2, 8, 10, 10, 12, 19], x = 11"

Output: "4"

Explanation: The largest element less than or equal to 11 is 10. Its last occurrence is at index 4.

Example 3

Input: "arr[] = [1, 2, 8, 10, 10, 12, 19], x = 0"

Output: "-1"

Explanation: No element is less than or equal to 0.

Approach: Binary Search

1. Initialize "low = 0" and "high = arr.length - 1".
2. Set "ans = -1".
3. Calculate "mid = low + (high - low) / 2".
4. If "arr[mid] <= x", store "mid" in "ans" and search the right half.
5. Otherwise, search the left half.
6. Return "ans".

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Concept

Floor means the largest element less than or equal to the target. When duplicates exist, return the index of the last occurrence of that floor value.
