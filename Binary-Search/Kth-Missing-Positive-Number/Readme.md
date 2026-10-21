1539. Kth Missing Positive Number

- Difficulty: Easy
- Platform: LeetCode
- Problem Link: https://leetcode.com/problems/kth-missing-positive-number/
- Topics: Array, Binary Search

Problem Statement

Given a sorted array of distinct positive integers "arr" and an integer "k", return the "k"th positive integer that is missing from the array.

Example

Input: "arr = [2, 3, 4, 7, 11]", "k = 5"

Output: "9"

Explanation: The missing positive integers are "[1, 5, 6, 8, 9, 10, ...]". The 5th missing positive integer is "9".

Approach 1: Brute Force — Linear Search

Pattern:

1. Traverse the array from left to right.
2. If the current element "<= k", increment "k".
3. Otherwise, stop.
4. Return "k".

- Time Complexity: "O(n)"
- Space Complexity: "O(1)"

Approach 2: Optimal — Binary Search

Pattern:

1. Calculate the number of missing positive integers at "mid": "arr[mid] - (mid + 1)".
2. If "missing < k", move right: "low = mid + 1".
3. If "missing >= k", move left: "high = mid - 1".
4. Return "low + k".

Intuition: Find the first position where the number of missing positive integers is at least "k".

- Time Complexity: "O(log n)"
- Space Complexity: "O(1)"

Key Takeaways

- Brute force: Present numbers push the target forward.
- Binary search: Count missing numbers and find the boundary.
- Missing count formula: "arr[mid] - (mid + 1)".
- Final answer: "low + k".

Edge Cases

- The answer is before the first array element.
- The answer lies between array elements.
- The answer is beyond the last array element.
- The array contains only one element.
