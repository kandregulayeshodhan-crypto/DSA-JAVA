33. Search in Rotated Sorted Array

- Platform: LeetCode
- Problem ID: 33
- Difficulty: Medium
- Problem Link: https://leetcode.com/problems/search-in-rotated-sorted-array/

Problem Statement

There is an integer array "nums" sorted in ascending order with distinct values.

Before being passed to your function, "nums" is possibly rotated at an unknown pivot index "k", where the resulting array is "[nums[k], nums[k+1], ..., nums[n-1], nums[0], nums[1], ..., nums[k-1]]" (0-indexed).

Given the array "nums" after the possible rotation and an integer "target", return the index of "target" if it is in "nums", or "-1" if it is not in "nums".

You must write an algorithm with O(log n) runtime complexity.

Examples

Example 1

Input: "nums = [4,5,6,7,0,1,2], target = 0"

Output: "4"

Explanation: The target 0 is at index 4.

Example 2

Input: "nums = [4,5,6,7,0,1,2], target = 3"

Output: "-1"

Explanation: The target 3 does not exist in the array.

Example 3

Input: "nums = [1], target = 0"

Output: "-1"

Constraints

- "1 <= nums.length <= 5000"
- "-10^4 <= nums[i] <= 10^4"
- All values of "nums" are unique.
- "nums" is sorted and possibly rotated.
- "-10^4 <= target <= 10^4"


Approach 1: Brute Force
  
Traverse the array from left to right.

If nums[i] == target, return index i.

If the target is not found after traversing the array, return -1.

Time Complexity: O(n)

Auxiliary Space: O(1)

Approach 2: Binary Search

1. Initialize "low = 0" and "high = nums.length - 1".
2. Calculate "mid = low + (high - low) / 2".
3. If "nums[mid] == target", return "mid".
4. Identify which half is sorted.
5. Check whether the target belongs in that sorted half.
6. Continue searching the appropriate half.
7. If the target is not found, return "-1".

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Concept

At every step, at least one half of the rotated array is sorted. Use that half to decide where to continue binary search.
