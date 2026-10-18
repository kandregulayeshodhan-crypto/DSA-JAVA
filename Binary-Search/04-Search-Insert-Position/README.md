Search Insert Position

Platform: LeetCode
Difficulty: Easy
Topic: Arrays, Binary Search

Problem Link: "Search Insert Position – LeetCode" (https://leetcode.com/problems/search-insert-position/)

Problem Statement

Given a sorted array of distinct integers and a target value, return the index if the target is found. Otherwise, return the index where it would be inserted in order.

The algorithm must run in "O(log n)" time.

Examples

Example 1

Input: "nums = [1, 3, 5, 6], target = 5"

Output: "2"

Example 2

Input: "nums = [1, 3, 5, 6], target = 2"

Output: "1"

Example 3

Input: "nums = [1, 3, 5, 6], target = 7"

Output: "4"

---

Approach 1: Brute Force (Linear Search)

Intuition:

- Traverse the array from left to right.
- Find the first element greater than or equal to the target.
- Return its index because the target can be inserted at that position while maintaining sorted order.
- If every element is smaller than the target, return the length of the array.

Time Complexity: "O(n)"

Auxiliary Space: "O(1)"

Approach 2: Optimal (Binary Search)

Intuition:

- Since the array is sorted, eliminate half of the search space in each iteration.
- Initialize "low = 0" and "high = n - 1".
- Calculate the middle index.
- If "nums[mid] >= target", search the left half because the answer could be at "mid" or at an earlier index.
- If "nums[mid] < target", search the right half because the insertion position must be after "mid".
- Continue until the search space becomes empty.
- Return "low", which represents the correct insertion position.

Time Complexity: "O(log n)"

Auxiliary Space: "O(1)"

---

Key Takeaways

- Search Insert Position follows the Lower Bound pattern.
- Find the first index where "nums[i] >= target".
- If no element satisfies the condition, return "n".
- In the binary search approach, when the loop ends, "low" gives the insertion position.
- Pattern to remember: Find the first index that satisfies a condition.
