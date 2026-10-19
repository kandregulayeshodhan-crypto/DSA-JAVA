Assign Cookies

Problem

You are given two arrays, "g" and "s".

- "g[i]" represents the greed factor of the "i-th" child.
- "s[j]" represents the size of the "j-th" cookie.

Each child can receive at most one cookie. A child will be content if the cookie size is greater than or equal to their greed factor.

Find the maximum number of content children.

Problem Link

"LeetCode 455 – Assign Cookies" (https://leetcode.com/problems/assign-cookies/)

Example

Input:

g = [1, 2, 3]
s = [1, 1]

Output:

1

Explanation:

The first child has a greed factor of "1" and can receive a cookie of size "1". The remaining cookie cannot satisfy either of the other children.

Therefore, the maximum number of content children is "1".

Approach 1: Brute Force

- Create a boolean array to track which cookies have already been assigned.
- Iterate through each child.
- For each child, check every cookie.
- If a cookie is unused and its size is greater than or equal to the child's greed factor, assign it to that child.
- Mark the cookie as used and increase the content children count.
- Move to the next child and repeat.
- Return the total number of content children.

Complexity Analysis

- Time Complexity: "O(n × m)"
- Space Complexity: "O(m)"

Here, "n" is the number of children and "m" is the number of cookies.

Approach 2: Optimal — Greedy Algorithm

- Sort both arrays in ascending order.
- Use two pointers: one for children and one for cookies.
- If the current cookie size is greater than or equal to the current child's greed factor, assign the cookie and move both pointers forward.
- Otherwise, the cookie is too small, so move only the cookie pointer to try the next larger cookie.
- Continue until all children or cookies have been considered.
- Return the number of content children.

Complexity Analysis

- Time Complexity: "O(n log n + m log m)"
- Space Complexity: Depends on the sorting implementation.

Here, "n" is the number of children and "m" is the number of cookies.

Topic

Greedy Algorithm, Two Pointers, Sorting

Language

Java