Find the Smallest Divisor Given a Threshold

Problem

Given an array of positive integers "nums" and an integer "threshold", find the smallest positive divisor such that the sum of all the array elements divided by the divisor and rounded up is less than or equal to the threshold.

Problem Link

"LeetCode 1283 – Find the Smallest Divisor Given a Threshold" (https://leetcode.com/problems/find-the-smallest-divisor-given-a-threshold/)

Example

Input:

nums = [1, 2, 5, 9], threshold = 6

Output:

5

Explanation: With divisor "5", the sum is "1 + 1 + 1 + 2 = 5", which is within the threshold. No smaller divisor satisfies the condition.

Approach

- Use Binary Search to find the smallest valid divisor.
- Set "low = 1" and "high = max(nums)".
- Calculate the sum of the ceiling of each number divided by "mid".
- If the sum is less than or equal to "threshold", try a smaller divisor.
- Otherwise, increase the divisor.

Complexity Analysis

- Time Complexity: O(n log m)
- Space Complexity: O(1)

Here, "n" is the array length and "m" is the maximum element in the array.

Topic

Binary Search on Answers

Language

Java