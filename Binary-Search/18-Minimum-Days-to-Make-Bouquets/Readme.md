 Minimum Number of Days to Make m Bouquets

Problem

You are given an array "bloomDay", where "bloomDay[i]" represents the day the "i-th" flower blooms. Each bouquet requires "k" adjacent flowers. Find the minimum number of days needed to make "m" bouquets.

If it is impossible to make "m" bouquets, return "-1".

Problem Link

"LeetCode 1482 – Minimum Number of Days to Make m Bouquets" (https://leetcode.com/problems/minimum-number-of-days-to-make-m-bouquets/)

Example

Input:

bloomDay = [1, 10, 3, 10, 2], m = 3, k = 1

Output:

3

Explanation: By day 3, the flowers at indices 0, 2, and 4 have bloomed. Since each bouquet requires one flower, we can make 3 bouquets.

Approach

- If "m * k > bloomDay.length", return "-1".
- Use Binary Search to search for the minimum number of days.
- Set "low" to the minimum bloom day and "high" to the maximum bloom day.
- For each middle day, count consecutive bloomed flowers.
- Every "k" adjacent bloomed flowers form one bouquet.
- If at least "m" bouquets can be made, search for fewer days.
- Otherwise, search for more days.

Complexity Analysis

- Time Complexity: O(n log(maxDay - minDay + 1))
- Space Complexity: O(1)

Here, "n" is the number of flowers.

Topic

Binary Search on Answers

Language

Java