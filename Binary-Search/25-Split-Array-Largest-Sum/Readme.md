Split Array Largest Sum

Platform: LeetCode
Difficulty: Hard
Topic: Binary Search, Arrays, Greedy

Problem Link: "Split Array Largest Sum – LeetCode" (https://leetcode.com/problems/split-array-largest-sum/)

Problem Statement

Given an integer array "nums" and an integer "k", split the array into "k" non-empty contiguous subarrays.

Minimize the largest sum among these subarrays and return that minimum possible largest sum.

Examples

Example 1

Input: "nums = [7, 2, 5, 10, 8], k = 2"

Output: "18"

Explanation: One optimal split is "[7, 2, 5]" and "[10, 8]". Their sums are "14" and "18", so the largest sum is "18".

Example 2

Input: "nums = [1, 2, 3, 4, 5], k = 2"

Output: "9"

Explanation: One optimal split is "[1, 2, 3]" and "[4, 5]". Their sums are "6" and "9".

---

Approach 1: Brute Force (Linear Search on Answer)

Intuition:

- The minimum possible largest sum is "max(nums)", because every element must belong to a subarray.
- The maximum possible largest sum is "sum(nums)", when the entire array is treated as one subarray.
- Try every possible maximum sum between these two limits.
- For each candidate, greedily split the array into contiguous subarrays without exceeding that sum.
- Count the number of subarrays required.
- If the candidate requires at most "k" subarrays, it is feasible.
- Return the first feasible candidate.

Time Complexity: "O(n × (sum(nums) - max(nums) + 1))"

Auxiliary Space: "O(1)"

Approach 2: Optimal (Binary Search on Answer)

Intuition:

- Initialize "low = max(nums)" and "high = sum(nums)".
- Calculate the middle value as the candidate maximum subarray sum.
- Greedily split the array while keeping each subarray sum within the candidate.
- If more than "k" subarrays are required, the candidate is too small. Search the right half.
- If at most "k" subarrays are required, store the candidate and search the left half for a smaller valid answer.
- Continue until the search space becomes empty.
- Return the minimum feasible largest sum.

Time Complexity: "O(n × log(sum(nums) - max(nums) + 1))"

Auxiliary Space: "O(1)"

---

Key Takeaways

- Pattern: Binary Search on Answer.
- Search space: "low = max(nums)", "high = sum(nums)".
- Feasibility check: Can the array be split using at most "k" subarrays without exceeding the candidate sum?
- If more than "k" subarrays are needed, increase the candidate sum.
- If at most "k" subarrays are needed, try a smaller candidate sum.
- The subarrays must be contiguous and preserve the original array order.
- This problem shares the same core pattern as Book Allocation and Painter's Partition.
