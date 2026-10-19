Single Element in a Sorted Array

- Platform: LeetCode
- Problem ID: 540
- Difficulty: Medium
- Problem Link: https://leetcode.com/problems/single-element-in-a-sorted-array/

Problem Statement

You are given a sorted array in which every element appears exactly twice, except for one element that appears only once.

Find and return the single element.

Your solution must run in "O(log n)" time and "O(1)" space.

Examples

Example 1

Input: "nums = [1,1,2,3,3,4,4,8,8]"

Output: "2"

Example 2

Input: "nums = [3,3,7,7,10,11,11]"

Output: "10"

Constraints

- "1 <= nums.length <= 10^5"
- "0 <= nums[i] <= 10^5"
- All elements appear exactly twice except one element.
- The array is sorted in ascending order.

---

Approach 1: Brute Force

Logic

1. If the array contains only one element, return that element.
2. Traverse the array from index "0" to "n - 1".
3. For the first element, check whether it differs from the next element.
4. For the last element, check whether it differs from the previous element.
5. For every middle element, check whether it differs from both its previous and next elements.
6. Return the element that appears only once.

Complexity Analysis

- Time Complexity: "O(n)" — in the worst case, every element is checked.
- Auxiliary Space: "O(1)" — no extra data structures are used.

---

Approach 2: Optimal — Binary Search

Logic

1. If the array contains only one element, return it.
2. Check the first element. If it differs from the second element, return it.
3. Check the last element. If it differs from the previous element, return it.
4. Initialize "low = 1" and "high = n - 2".
5. Calculate "mid = (low + high) / 2".
6. If "nums[mid]" differs from both neighbors, return "nums[mid]".
7. If "mid" is even and "nums[mid] == nums[mid + 1]", or "mid" is odd and "nums[mid] == nums[mid - 1]", the single element is on the right. Set "low = mid + 1".
8. Otherwise, the single element is on the left. Set "high = mid - 1".
9. Continue until the single element is found.

Complexity Analysis

- Time Complexity: "O(log n)" — the search range is halved in each iteration.
- Auxiliary Space: "O(1)" — only a few variables are used.

---

Key Concept

Before the single element, pairs start at even indices: "(0,1)", "(2,3)", "(4,5)".

After the single element, this pairing pattern shifts.

- If the middle index follows the normal pairing pattern, search the right half.
- If the pairing pattern is broken, search the left half.
- The single element is where the pairing pattern changes.

Remember: Brute force checks each element's neighbors. Binary search uses index parity and pair alignment to find the answer efficiently.
