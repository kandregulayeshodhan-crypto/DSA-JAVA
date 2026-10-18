Painter's Partition Problem

Platform: GeeksforGeeks / Coding Interview Problem
Difficulty: Hard
Topic: Binary Search, Arrays

Problem Link: "Painter's Partition Problem – GeeksforGeeks" (https://www.geeksforgeeks.org/problems/the-painters-partition-problem1535/1)

Problem Statement

Given an array "arr[]" representing the time required to paint each board and an integer "k" representing the number of painters, allocate the boards to painters such that:

- Each painter paints a contiguous sequence of boards.
- Each board is painted by exactly one painter.
- All painters work simultaneously.
- The maximum time taken by any painter is minimized.

Return the minimum possible time required to paint all the boards.

Example

Input: "arr = [10, 20, 30, 40], k = 2"

Output: "60"

Explanation: One optimal allocation is:

- Painter 1: boards "[10, 20, 30]" → total time "60"
- Painter 2: board "[40]" → total time "40"

The maximum time is "60", which is minimized.

---

Approach 1: Brute Force (Try All Possible Maximum Times)

Intuition:

- The minimum possible maximum time is the largest board length because one painter must paint the longest board.
- The maximum possible time is the sum of all board lengths because one painter could paint every board.
- Try every possible maximum time between these two limits.
- For each candidate time, greedily allocate contiguous boards to painters without exceeding the candidate time.
- Count the painters required.
- If the allocation requires at most "k" painters, the candidate time is feasible.
- Return the first feasible time.

Time Complexity: "O((sum(arr) - max(arr) + 1) × n)" in the worst case.

Auxiliary Space: "O(1)"

Approach 2: Optimal (Binary Search on Answer)

Intuition:

- The answer lies between "max(arr)" and "sum(arr)".
- Initialize "low = max(arr)" and "high = sum(arr)".
- Calculate the middle value as the candidate maximum painting time.
- Greedily allocate contiguous boards to painters without exceeding this candidate time.
- If the number of painters required is greater than "k", the candidate time is too small. Search the right half.
- Otherwise, the candidate is feasible. Store it as a possible answer and search the left half for a smaller feasible time.
- Continue until the search space becomes empty.
- Return the minimum feasible maximum time.

Time Complexity: "O(n × log(sum(arr) - max(arr) + 1))"

Auxiliary Space: "O(1)"

---

Key Takeaways

- Pattern: Binary Search on Answer.
- Search space: "low = max(arr)", "high = sum(arr)".
- Feasibility check: Can all boards be painted within the candidate time using at most "k" painters?
- If more than "k" painters are required, increase the candidate time.
- If at most "k" painters are required, try a smaller candidate time.
- Greedy allocation works because each painter must receive a contiguous sequence of boards.
- This problem shares the same core pattern as Book Allocation and Split Array Largest Sum.
