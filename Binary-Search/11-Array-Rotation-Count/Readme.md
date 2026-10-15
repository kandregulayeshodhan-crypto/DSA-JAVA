Find Out How Many Times the Array Is Rotated

- Platform: GeeksforGeeks
- Problem link: 
- GFG – Find Kth Rotation

Problem Statement

Given a sorted array that has been rotated, find the number of times it has been rotated.

For an array rotated to the right, the rotation count is the index of the minimum element, assuming the original array was sorted in ascending order and the elements are distinct.

Examples

Example 1

Input: "arr = [4, 5, 1, 2, 3]"

Output: "2"

Explanation: The minimum element 1 is at index 2.

Example 2

Input: "arr = [3, 4, 5, 1, 2]"

Output: "3"

Explanation: The minimum element 1 is at index 3.

Approach: Binary Search

1. Initialize "low = 0" and "high = arr.length - 1".
2. Find the middle index.
3. Compare the middle element with the rightmost element.
4. If "arr[mid] > arr[high]", search the right half.
5. Otherwise, search the left half, including "mid".
6. When "low == high", return that index.

Complexity Analysis

- Time Complexity: O(log n)
- Auxiliary Space: O(1)

Key Concept

For a rotated sorted array with distinct elements, the index of the minimum element gives the right-rotation count.
