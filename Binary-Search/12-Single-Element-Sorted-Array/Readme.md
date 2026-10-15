540. Single Element in a Sorted Array

- Platform: LeetCode
- Problem ID: 540
- Difficulty: Medium
- Problem Link: https://leetcode.com/problems/single-element-in-a-sorted-array/

Problem Statement

You are given a sorted array consisting of only integers where every element appears exactly twice, except for one element that appears exactly once.

Return the single element that appears only once.

Your solution must run in O(log n) time and O(1) space.

Examples

Example 1

Input: "nums = [1, 1, 2, 3, 3, 4, 4, 8, 8]"

Output: "2"

Example 2

Input: "nums = [3, 3, 7, 7, 10, 11, 11]"

Output: "10"

Constraints

- "1 <= nums.length <= 10^5"
- "0 <= nums[i] <= 10^5"
- Every element appears twice except one element.

Approach: Binary Search

1. Initialize "low = 0" and "high = nums.length - 1".
2. Calculate "mid".
3. Ensure "mid" is even so it aligns with the start of a pair.
4. If "nums[mid] == nums[mid + 1]", search the right half.
5. Otherwise, search the left half, including "mid".
6. When "low == high", return "nums[low]".

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Concept

Before the single element, pairs begin at even indices. After it, this pairing pattern shifts.
