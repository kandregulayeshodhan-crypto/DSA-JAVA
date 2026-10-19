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

Approach 1: Brute Force

Initialize min = nums[0].

Traverse the array from index 1 to nums.length - 1.

If nums[i] < min, update min = nums[i].

Return min.

Time Complexity: O(n)

Auxiliary Space: O(1)

Approach 2:  Modified Binary Search

Initialize low = 0, high = nums.length - 1, and ans = Integer.MAX_VALUE.

While low <= high, check whether the current search range is already sorted.

If nums[low] < nums[high], update ans = Math.min(ans, nums[low]) and stop the loop.

Calculate mid = (low + high) / 2.

If nums[low] == nums[mid] && nums[mid] == nums[high]:

Update ans = Math.min(ans, nums[low]).

Shrink the search range by setting low++ and high--.

Otherwise, if nums[low] <= nums[mid]:

The left half is sorted.

Update ans = Math.min(ans, nums[low]).

Search the right half by setting low = mid + 1.

Otherwise:

Update ans = Math.min(ans, nums[mid]).

Search the left half by setting high = mid - 1.

Return ans.



Complexity Analysis

- Average Time Complexity: O(log n)
- Worst-case Time Complexity: O(n), due to duplicates.
- Auxiliary Space: O(1)

Key Concept

When duplicates exist, comparing the middle and rightmost elements may not identify the correct half. If they are equal, safely reduce "high" by one.
