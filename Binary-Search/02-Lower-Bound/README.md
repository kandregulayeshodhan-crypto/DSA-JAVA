Implement Lower Bound

Platform: GeeksforGeeks
Difficulty: Easy
Topic: Binary Search, Arrays

Problem Link: "Implement Lower Bound – GeeksforGeeks" (https://www.geeksforgeeks.org/problems/implement-lower-bound/1)

Problem Statement

Given a sorted array "arr[]" (following 0-based indexing) and a number "target", find the lower bound of the target.

The lower bound is the smallest index where the element is greater than or equal to the target.

If no such element exists, return the length of the array.

Examples

Example 1

Input: "arr = [2, 3, 7, 10, 11, 11, 25], target = 9"

Output: "3"

Example 2

Input: "arr = [2, 3, 7, 10, 11, 11, 25], target = 11"

Output: "4"

Example 3

Input: "arr = [2, 3, 7, 10, 11, 11, 25], target = 100"

Output: "7"

---

Approach 1: Brute Force (Linear Search)

Intuition:

- Traverse the array from left to right.
- Find the first element that is greater than or equal to the target.
- Return its index immediately.
- If no such element exists, return the length of the array.

Time Complexity: "O(n)"

Auxiliary Space: "O(1)"

Approach 2: Optimal (Binary Search)

Intuition:

- Since the array is sorted, eliminate half of the search space in each iteration.
- Initialize "low = 0", "high = n - 1", and "ans = n".
- Calculate the middle index.
- If "arr[mid] >= target", store "mid" as a possible answer and search the left half for an earlier valid index.
- If "arr[mid] < target", search the right half because the current element and all elements before it are too small.
- Continue until the search space becomes empty.
- Return the stored answer. If no valid element exists, the answer remains "n".

Time Complexity: "O(log n)"

Auxiliary Space: "O(1)"

---

Key Takeaways

- Lower Bound: First index where "arr[i] >= target".
- If the condition is satisfied, store the index and search left.
- If the condition is not satisfied, search right.
- Initialize the answer to "n" to handle cases where all elements are smaller than the target.
- Binary Search pattern: Find the first index that satisfies a condition.