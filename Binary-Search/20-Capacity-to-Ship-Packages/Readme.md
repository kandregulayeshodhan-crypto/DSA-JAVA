Capacity to Ship Packages Within D Days

Problem

A conveyor belt has packages that must be shipped within "days" days. The packages must be shipped in the given order. Find the minimum ship capacity required to ship all packages within the given number of days.

Problem Link

"LeetCode 1011 – Capacity To Ship Packages Within D Days" (https://leetcode.com/problems/capacity-to-ship-packages-within-d-days/)

Example

Input:

weights = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10], days = 5

Output:

15

Explanation: With a ship capacity of "15", all packages can be shipped in 5 days while keeping their original order.

Approach

- Set "low" to the maximum package weight.
- Set "high" to the sum of all package weights.
- Use Binary Search to find the minimum valid capacity.
- For each capacity, simulate shipping packages in order and count the days required.
- If the required days are less than or equal to "days", try a smaller capacity.
- Otherwise, increase the capacity.

Complexity Analysis

- Time Complexity: O(n log(sum - max + 1))
- Space Complexity: O(1)

Here, "n" is the number of packages, "sum" is the total weight, and "max" is the maximum package weight.

Topic

Binary Search on Answers

Language

Java