Implement Upper Bound

- Platform: GeeksforGeeks
- Difficulty: Easy
- Problem Link: https://www.geeksforgeeks.org/problems/implement-upper-bound/1

Problem Statement

Given a sorted array "arr[]" and a number "target", find the upper bound of the "target" in the given array.

The upper bound is the smallest index where the element is strictly greater than the given target.

Note: If no element is greater than the target, return the length of the array.

Examples

Example 1

Input: "arr[] = [1, 2, 4, 7, 7, 9], target = 7"

Output: "5"

Explanation: The first element strictly greater than 7 is 9, which is at index 5.

Example 2

Input: "arr[] = [1, 2, 4, 7, 7, 9], target = 5"

Output: "3"

Explanation: The first element strictly greater than 5 is 7, which is at index 3.

Example 3

Input: "arr[] = [1, 2, 4, 7, 7, 9], target = 10"

Output: "6"

Explanation: No element is greater than 10, so return the array length, 6.

Approach: Binary Search

1. Initialize "low = 0", "high = arr.length - 1", and "ans = arr.length".
2. Calculate "mid = low + (high - low) / 2".
3. If "arr[mid] > target", store "mid" in "ans" and search the left half.
4. Otherwise, search the right half.
5. Return "ans".

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Difference

- Lower Bound: First element ">= target".
- Upper Bound: First element "> target".
