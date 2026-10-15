81. Search in Rotated Sorted Array II

- Platform: LeetCode
- Problem ID: 81
- Difficulty: Medium
- Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array-ii/

Problem Statement

There is an integer array "nums" sorted in non-decreasing order (not necessarily with distinct values).

Before being passed to your function, "nums" is possibly rotated at an unknown pivot index "k".

Given the array "nums" after the possible rotation and an integer "target", return "true" if "target" is in "nums", or "false" if it is not in "nums".

You must decrease the overall operation steps as much as possible.

Examples

Example 1

Input: "nums = [2,5,6,0,0,1,2], target = 0"

Output: "true"

Example 2

Input: "nums = [2,5,6,0,0,1,2], target = 3"

Output: "false"

Example 3

Input: "nums = [1], target = 0"

Output: "false"

Constraints

- "1 <= nums.length <= 5000"
- "-10^4 <= nums[i] <= 10^4"
- "nums" is rotated at an unknown pivot.
- "-10^4 <= target <= 10^4"

Approach: Modified Binary Search

1. Initialize "low = 0" and "high = nums.length - 1".
2. Calculate "mid = low + (high - low) / 2".
3. If "nums[mid] == target", return "true".
4. If "nums[low] == nums[mid] && nums[mid] == nums[high]", shrink both ends.
5. Otherwise, identify the sorted half and determine whether the target belongs there.
6. Continue searching the appropriate half.
7. Return "false" if the target is not found.

Complexity Analysis

- Average Time Complexity: O(log n)
- Worst-case Time Complexity: O(n), due to duplicates.
- Auxiliary Space: O(1)

Key Concept

Duplicates can make it impossible to identify the sorted half immediately. When the left, middle, and right values are equal, shrink the search range.
