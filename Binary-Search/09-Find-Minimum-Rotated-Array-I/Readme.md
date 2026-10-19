153. Find Minimum in Rotated Sorted Array

- Platform: LeetCode
- Problem ID: 153
- Difficulty: Medium
- Problem Link: https://leetcode.com/problems/find-minimum-in-rotated-sorted-array/

Problem Statement

Suppose an array of length "n" sorted in ascending order is rotated between 1 and "n" times.

Given the rotated array "nums" of unique elements, return the minimum element of this array.

You must write an algorithm that runs in O(log n) time.

Examples

Example 1

Input: "nums = [3,4,5,1,2]"

Output: "1"

Explanation: The original array was "[1,2,3,4,5]", rotated 3 times.

Example 2

Input: "nums = [4,5,6,7,0,1,2]"

Output: "0"

Example 3

Input: "nums = [11,13,15,17]"

Output: "11"

Constraints

- "n == nums.length"
- "1 <= n <= 5000"
- "-5000 <= nums[i] <= 5000"
- All elements are unique.
- "nums" is sorted and rotated between 1 and "n" times.

Approach 1: Brute Force

Initialize min = nums[0].

Traverse the array from index 1 to nums.length - 1.

If nums[i] < min, update min = nums[i].

Return min.

Time Complexity: O(n)

Auxiliary Space: O(1)

Approach 2: Binary Search

Initialize low = 0 and high = nums.length - 1.

Initialize ans = Integer.MAX_VALUE.

While low <= high, calculate mid = (low + high) / 2.

If nums[low] < nums[high], update ans = Math.min(ans, nums[low]) and stop the loop.

If nums[low] <= nums[mid], the left half is sorted. Update ans = Math.min(ans, nums[low]) and search the right half by setting low = mid + 1.

Otherwise, update ans = Math.min(ans, nums[mid]) and search the left half by setting high = mid - 1.

Return ans.

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Concept

Compare the middle element with the rightmost element to determine which half contains the minimum.
