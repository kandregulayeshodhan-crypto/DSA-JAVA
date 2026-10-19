Find the Number of Rotations

- Platform: GeeksforGeeks
- Problem: Find the number of times a sorted array is rotated
- Problem Link: https://www.geeksforgeeks.org/problems/rotation4723/1

Problem Statement

Given a sorted array that has been rotated some number of times, find the number of rotations.

The array contains distinct elements and is originally sorted in ascending order.

Example

Input: "arr = [4, 5, 1, 2, 3]"

Output: "2"

Explanation: The smallest element is "1", at index "2". Therefore, the array has been rotated "2" times.

Approach 1: Brute Force

Logic

1. Initialize "min = arr[0]" and "index = 0".
2. Traverse the array from index "1" to "n - 1".
3. If "arr[i] < min", update "min = arr[i]" and "index = i".
4. Return "index", which is the index of the smallest element.

Complexity Analysis

- Time Complexity: "O(n)" — traverse the array once.
- Auxiliary Space: "O(1)" — use only a few variables.

---

Approach 2: Optimal — Binary Search

Logic

1. Initialize "low = 0", "high = n - 1", "ans = Integer.MAX_VALUE", and "index = -1".
2. Run binary search while "low <= high".
3. If "arr[low] <= arr[high]", the current search range is sorted. If "arr[low]" is smaller than "ans", update "ans" and "index". Then break.
4. Calculate "mid = (low + high) / 2".
5. If "arr[low] <= arr[mid]", the left half is sorted:
   - If "arr[low] < ans", update "ans = arr[low]" and "index = low".
   - Search the right half by setting "low = mid + 1".
6. Otherwise, the right half contains the minimum:
   - If "arr[mid] < ans", update "ans = arr[mid]" and "index = mid".
   - Search the left half by setting "high = mid - 1".
7. Return "index", the position of the smallest element.

Complexity Analysis

- Time Complexity: "O(log n)" — the search range is reduced by approximately half in each iteration.
- Auxiliary Space: "O(1)" — only a few variables are used.

---

Key Concept

- The number of rotations equals the index of the smallest element, assuming a sorted array rotated to the right.
- Brute Force: Find the smallest element by checking every element.
- Binary Search: Identify the sorted half, update the minimum candidate, and eliminate that half from further searching.
- When the entire search range is sorted, its first element is the minimum, so update the answer and stop.
