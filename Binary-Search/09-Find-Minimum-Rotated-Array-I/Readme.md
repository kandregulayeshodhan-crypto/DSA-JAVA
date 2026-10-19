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

1. Initialize "low = 0" and "high = nums.length - 1".
2. While "low < high", calculate "mid".
3. If "nums[mid] > nums[high]", the minimum is in the right half; set "low = mid + 1".
4. Otherwise, the minimum is at "mid" or in the left half; set "high = mid".
5. Return "nums[low]".

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Concept

Compare the middle element with the rightmost element to determine which half contains the minimum.
