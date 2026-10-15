154. Find Minimum in Rotated Sorted Array II

- Platform: LeetCode
- Problem ID: 154
- Difficulty: Hard
- Problem Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array-ii/

Problem Statement

Suppose an array of length "n" sorted in ascending order is rotated between 1 and "n" times.

Given the rotated array "nums" that may contain duplicate elements, return the minimum element of this array.

Try to minimize the total number of operations.

Examples

Example 1

Input: "nums = [1,3,5]"

Output: "1"

Example 2

Input: "nums = [2,2,2,0,1]"

Output: "0"

Constraints

- "n == nums.length"
- "1 <= n <= 5000"
- "-5000 <= nums[i] <= 5000"
- "nums" is sorted and may contain duplicates.
- "nums" is rotated between 1 and "n" times.

Approach: Modified Binary Search

1. Initialize "low = 0" and "high = nums.length - 1".
2. While "low < high", calculate "mid".
3. If "nums[mid] > nums[high]", set "low = mid + 1".
4. If "nums[mid] < nums[high]", set "high = mid".
5. If "nums[mid] == nums[high]", decrease "high" by 1.
6. Return "nums[low]".

Complexity Analysis

- Average Time Complexity: O(log n)
- Worst-case Time Complexity: O(n), due to duplicates.
- Auxiliary Space: O(1)

Key Concept

When duplicates exist, comparing the middle and rightmost elements may not identify the correct half. If they are equal, safely reduce "high" by one.
