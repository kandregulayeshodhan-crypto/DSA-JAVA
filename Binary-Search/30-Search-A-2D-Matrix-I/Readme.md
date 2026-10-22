Search a 2D Matrix I

Problem Details

- Platform: LeetCode
- Problem Link: https://leetcode.com/problems/search-a-2d-matrix/
- Difficulty: Medium
- Topic: Binary Search, 2D Arrays, Matrix

Problem Statement

Given an "m × n" matrix with the following properties:

1. Each row is sorted in ascending order.
2. The first element of each row is greater than the last element of the previous row.

Given a target value, return "true" if the target exists in the matrix; otherwise, return "false".

Approaches

1. Brute Force

- Traverse every element using nested loops.
- Compare each element with the target.
- Return "true" if the target is found; otherwise, return "false" after checking all elements.

Time Complexity: O(m × n)
Space Complexity: O(1)

2. Better Approach — Binary Search on Each Row

- Apply binary search separately to every row because each row is sorted.
- If the target is found in any row, return "true".
- If no row contains the target, return "false".

Time Complexity: O(m × log n)
Space Complexity: O(1)

3. Optimal Approach — Binary Search on the Entire Matrix

- Treat the matrix as a virtual one-dimensional sorted array without actually creating another array.
- Set the search range from index "0" to "m × n − 1".
- Calculate the middle index using binary search.
- Convert the virtual index into a matrix position:
  - "row = mid / cols"
  - "col = mid % cols"
- Compare the target with the matrix element and adjust the binary search boundaries.
- Return "true" if found; otherwise, return "false".

Time Complexity: O(log(m × n))
Space Complexity: O(1)

Key Intuition

The matrix is globally sorted when its elements are read row by row. Therefore, we can perform binary search on the entire matrix by mapping virtual one-dimensional indices to two-dimensional positions.

- Division ("mid / cols"): Gives the row index by counting complete groups of columns.
- Remainder ("mid % cols"): Gives the column index within the current row.


Patterns Learned

- Linear search in a 2D matrix.
- Binary search on sorted rows.
- Binary search on a virtual flattened array.
- Converting a 1D index into 2D coordinates using division and remainder.

Key Takeaway

When a matrix follows a globally sorted row-by-row order, we can apply binary search directly to the virtual flattened array and achieve O(log(m × n)) time with O(1) auxiliary space.
