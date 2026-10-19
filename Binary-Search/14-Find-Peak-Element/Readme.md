Find Peak Element

- Platform: LeetCode
- Problem ID: 162
- Difficulty: Medium
- Problem Link: https://leetcode.com/problems/find-peak-element/

Problem Statement

A peak element is an element that is strictly greater than its neighbors.

Given an integer array "nums", find a peak element and return its index. If the array contains multiple peaks, return the index of any peak.

Assume "nums[-1] = nums[n] = -∞".

Your solution must run in "O(log n)" time.

Examples

Example 1

Input: "nums = [1, 2, 3, 1]"

Output: "2"

Explanation: The element "3" at index "2" is a peak element.

Example 2

Input: "nums = [1, 2, 1, 3, 5, 6, 4]"

Output: "5"

Explanation: The element "6" at index "5" is a peak element.

Constraints

- "1 <= nums.length <= 1000"
- "-2^31 <= nums[i] <= 2^31 - 1"
- Adjacent elements are different.

---

Approach 1: Brute Force

Logic

1. If the array contains only one element, return index "0".
2. Check whether the first element is greater than the second element. If yes, return index "0".
3. Traverse the middle elements from index "1" to "n - 2".
4. If an element is greater than both its previous and next elements, return its index.
5. Check whether the last element is greater than the previous element. If yes, return index "n - 1".
6. If no peak is found, return "-1".

Complexity Analysis

- Time Complexity: "O(n)" — in the worst case, every element is checked.
- Auxiliary Space: "O(1)" — no extra data structures are used.

---

Approach 2: Optimal — Binary Search

Logic

1. If the array contains only one element, return index "0".
2. Check whether the first element is a peak. If yes, return index "0".
3. Check whether the last element is a peak. If yes, return index "n - 1".
4. Initialize "low = 1" and "high = n - 2".
5. Calculate "mid = (low + high) / 2".
6. If the middle element is greater than both neighbors, return "mid".
7. If the middle element is greater than its previous element, the sequence is rising. Move right by setting "low = mid + 1".
8. Otherwise, move left by setting "high = mid - 1".
9. Continue until a peak is found or the search ends.

Complexity Analysis

- Time Complexity: "O(log n)" — the search range is reduced in each iteration.
- Auxiliary Space: "O(1)" — only a few variables are used.

---

Key Concept

- Brute Force: Check each element against its neighbors until a peak is found.
- Binary Search: If the sequence is rising at "mid", search the right half. If it is falling, search the left half.
- The first and last elements can also be peaks because the elements outside the array are considered negative infinity.
- Remember: Brute force checks elements one by one; binary search uses the direction of the sequence to reduce the search range.
