162. Find Peak Element

- Platform: LeetCode
- Problem ID: 162
- Difficulty: Medium
- Problem Link: https://leetcode.com/problems/find-peak-element/

Problem Statement

A peak element is an element that is strictly greater than its neighbors.

Given an integer array "nums", find a peak element and return its index. If the array contains multiple peaks, return the index of any peak.

Assume "nums[-1] = nums[n] = -∞".

Your solution must run in O(log n) time.

Examples

Example 1

Input: "nums = [1, 2, 3, 1]"

Output: "2"

Explanation: The element 3 at index 2 is a peak element.

Example 2

Input: "nums = [1, 2, 1, 3, 5, 6, 4]"

Output: "5"

Explanation: The element 6 at index 5 is a peak element.

Constraints

- "1 <= nums.length <= 1000"
- "-2^31 <= nums[i] <= 2^31 - 1"
- Adjacent elements are different.

Approach: Binary Search

1. Initialize "low = 0" and "high = nums.length - 1".
2. Calculate "mid".
3. If "nums[mid] > nums[mid + 1]", a peak exists at "mid" or to its left. Set "high = mid".
4. Otherwise, a peak exists to the right. Set "low = mid + 1".
5. Return "low".

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Concept

If the sequence is rising at "mid", move right. If it is falling, keep "mid" and move left.
