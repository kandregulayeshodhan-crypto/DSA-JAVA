Koko Eating Bananas

Problem

Koko loves to eat bananas. Find the minimum integer eating speed "k" such that Koko can eat all the bananas within "h" hours.

Problem Link

"LeetCode 875 – Koko Eating Bananas" (https://leetcode.com/problems/koko-eating-bananas/)

Example

Input:

piles = [3, 6, 7, 11], h = 8

Output:

4

Explanation: At a speed of 4 bananas per hour, Koko finishes all piles within 8 hours.

Approach

- Use Binary Search to find the minimum eating speed.
- Search between "1" and the maximum pile size.
- For each speed, calculate the total hours required.
- If the required hours are within "h", try a smaller speed.
- Otherwise, increase the speed.

Complexity Analysis

- Time Complexity: O(n log m)
- Space Complexity: O(1)

Here, "n" is the number of piles and "m" is the maximum pile size.

Topic

Binary Search on Answers

Language

Java