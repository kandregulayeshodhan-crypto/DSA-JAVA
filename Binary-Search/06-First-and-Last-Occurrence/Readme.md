34. Find First and Last Position of Element in Sorted Array

- Platform: LeetCode
- Problem ID: 34
- Difficulty: Medium
- Problem Link: https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/

Problem Statement

Given an array of integers "nums" sorted in non-decreasing order, find the starting and ending position of a given target value.

If the target is not found in the array, return "[-1, -1]".

You must write an algorithm with O(log n) runtime complexity.

Examples

Example 1

Input: "nums = [5, 7, 7, 8, 8, 10], target = 8"

Output: "[3, 4]"

Explanation: The first occurrence of 8 is at index 3, and the last occurrence is at index 4.

Example 2

Input: "nums = [5, 7, 7, 8, 8, 10], target = 6"

Output: "[-1, -1]"

Explanation: The target 6 does not exist in the array.

Example 3

Input: "nums = [], target = 0"

Output: "[-1, -1]"

Explanation: The array is empty, so the target cannot be found.

Approach 1: Brute Force

Initialize first = -1 and last = -1.

Traverse the array from left to right.

If nums[i] == target:

If first == -1, store i in first.

Update last = i every time the target is found.

Return [first, last].

Time Complexity: O(n)

Auxiliary Space: O(1), excluding the output array.


Approach 2: Binary Search

1. Use binary search to find the first occurrence of the target.
2. Use binary search to find the last occurrence of the target.
3. If the target does not exist, return "[-1, -1]".

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Concept

Use two binary searches: one to find the first occurrence and another to find the last occurrence.
