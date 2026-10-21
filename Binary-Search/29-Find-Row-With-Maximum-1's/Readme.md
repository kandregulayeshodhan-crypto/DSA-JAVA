Find the Row with Maximum Number of 1s

- Difficulty: Easy
- Topic: Binary Search, Matrix
- Problem Link: "GeeksforGeeks – Find the Row with Maximum Number of 1s" (https://www.geeksforgeeks.org/problems/row-with-max-1s0023/1)

Problem Statement

Given a binary matrix "mat" containing only "0"s and "1"s, where each row is sorted in non-decreasing order, find the index of the row containing the maximum number of "1"s.

If no row contains a "1", return "-1". If multiple rows have the same maximum number of "1"s, return the index of the first such row.

Example

Input

mat = [
    [0, 0, 1, 1, 1],
    [0, 0, 0, 1, 1],
    [0, 1, 1, 1, 1]
]

Output

2

Explanation

- Row 0 contains 3 ones.
- Row 1 contains 2 ones.
- Row 2 contains 4 ones.

Row 2 contains the maximum number of ones, so the answer is "2".

Approach 1: Brute Force

1. Traverse every row of the matrix.
2. Count the number of ones in each row.
3. Maintain the maximum count and its row index.
4. Return the row index with the maximum number of ones.

Time Complexity: "O(rows × cols)"

Space Complexity: "O(1)"

Approach 2: Optimal — Binary Search (Lower Bound)

Intuition

Since every row is sorted, all zeros appear before all ones. Use binary search to find the first occurrence of "1" in each row.

Calculate the number of ones using:

"count = cols - firstOne"

Compare this count with the maximum found so far and update the row index when a larger count is found.

Time Complexity: "O(rows × log(cols))"

Space Complexity: "O(1)"

Key Learnings

- Use binary search on sorted rows.
- Lower bound finds the first index where the element is greater than or equal to the target.
- Number of ones = total columns − index of the first one.
- Using "count > maxOnes" preserves the first row when there is a tie.
- Initialize "rowIndex = -1" to handle a matrix containing only zeros.

Pattern

Binary Search → Lower Bound → Sorted Rows

