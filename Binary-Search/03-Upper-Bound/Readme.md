Implement Upper Bound

Platform: GeeksforGeeks

Difficulty: Easy

Topic: Binary Search, Arrays

Problem Link: "Implement Upper Bound – GeeksforGeeks" (https://www.geeksforgeeks.org/problems/implement-upper-bound/1)

Problem Statement

Given a sorted array "arr[]" and a number "target", find the upper bound of the target.

The upper bound is the smallest index where the element is strictly greater than the target.

If no element is greater than the target, return the length of the array.

Examples

Example 1

Input: "arr = [1, 2, 4, 7, 7, 9], target = 7"

Output: "5"

Example 2

Input: "arr = [1, 2, 4, 7, 7, 9], target = 5"

Output: "3"

Example 3

Input: "arr = [1, 2, 4, 7, 7, 9], target = 10"

Output: "6"

---

Approach 1: Brute Force (Linear Search)

Intuition:

- Traverse the array from left to right.
- Find the first element strictly greater than the target.
- Return its index immediately.
- If no such element exists, return the length of the array.

Time Complexity: "O(n)"

Auxiliary Space: "O(1)"

Approach 2: Optimal (Binary Search)

Intuition:

- Since the array is sorted, eliminate half of the search space in each iteration.
- Initialize "low = 0", "high = n - 1", and "ans = n".
- Calculate the middle index.
- If "arr[mid] > target", store "mid" as a possible answer and search the left half for an earlier valid index.
- Otherwise, search the right half because the current element and all elements before it are less than or equal to the target.
- Continue until the search space becomes empty.
- Return the stored answer. If no valid element exists, the answer remains "n".

Time Complexity: "O(log n)"

Auxiliary Space: "O(1)"

---
Key Difference: Lower Bound vs Upper Bound

Lower Bound

- First element ">= target"
- If "arr[mid] >= target", search left.
- Returns the first occurrence when the target exists.

Upper Bound

- First element "> target"
- If "arr[mid] > target", search left.
- Skips all occurrences equal to the target.
  
Key Takeaways

- Upper Bound: Find the first index where "arr[i] > target".
- If the condition is satisfied, store the index and search left.
- Otherwise, search right.
- Initialize the answer to "n" to handle cases where no element is greater than the target.
- Binary Search pattern: Find the first index that satisfies a condition.
