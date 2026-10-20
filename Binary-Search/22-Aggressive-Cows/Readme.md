Aggressive Cows

- Difficulty: Medium
- Topic: Binary Search, Greedy
- Problem Link: "Aggressive Cows — GeeksforGeeks" (https://www.geeksforgeeks.org/problems/aggressive-cows/1)

Problem Statement

You are given an array "stalls[]" representing the positions of stalls and an integer "k" representing the number of cows. Place the cows in the stalls such that the minimum distance between any two cows is maximized.

Return the largest possible minimum distance.

Example

Input:

- "stalls = [1, 1, 4, 8]"
- "k = 3"

Output: "3"

Explanation:

Place the three cows at positions "1", "4", and "8".

The distances between consecutive cows are "3" and "4". The minimum distance is "3", which is the maximum achievable minimum distance.

Approach 1: Brute Force (Backward Loop)

Intuition

Try every possible minimum distance, starting from the largest possible distance and moving backwards.

Steps

1. Sort the stall positions in ascending order.
2. Calculate the maximum possible distance using the last stall position minus the first stall position.
3. Start checking distances from the maximum possible distance down to "0".
4. For each distance, greedily place the first cow in the first stall.
5. Traverse the remaining stalls and place a cow whenever the distance from the last placed cow is greater than or equal to the current distance.
6. If all "k" cows can be placed, return the current distance immediately.
7. If no distance is feasible, return "0".

Why does it work?

We check distances from largest to smallest. Therefore, the first feasible distance is the maximum possible minimum distance.

Complexity Analysis

- Time Complexity: (O(n log n+nD))
- Space Complexity: (O(1)) auxiliary space, excluding sorting implementation details.

Here, "n" is the number of stalls and "D" is the difference between the maximum and minimum stall positions.

Approach 2: Optimal (Binary Search on Answer)

Intuition

Instead of checking every possible distance, use binary search to find the maximum feasible distance.

Search Space

- Low: "1" when the answer must be positive. Use "0" if duplicate stall positions are allowed and the answer can be zero.
- High: Last stall position minus first stall position, after sorting.
- Mid: The candidate minimum distance being tested.

Steps

1. Sort the stall positions in ascending order.
2. Initialize the binary search boundaries.
3. Calculate the middle distance.
4. Use the greedy cow-placement check to determine whether all "k" cows can be placed.
5. If placement is possible, try a larger distance by moving "low" to "mid + 1".
6. If placement is impossible, try a smaller distance by moving "high" to "mid - 1".
7. When the search ends, return "high", the maximum feasible distance.

Why does binary search work?

- If a distance is possible, every smaller nonnegative distance is also possible.
- If a distance is impossible, every larger distance is also impossible.

This monotonic property allows binary search on the answer.

Complexity Analysis

- Time Complexity: (O(n log n+nlog D))
- Space Complexity: (O(1)) auxiliary space, excluding sorting implementation details.

Here, "n" is the number of stalls and "D" is the difference between the maximum and minimum stall positions.

Key Differences: Brute Force vs Optimal

Brute Force

- Checks every possible distance from largest to smallest.
- Uses a backward "for" loop.
- Returns immediately when the first feasible distance is found.
- Does not require an "answer" variable.
- Time Complexity: (O(n\log n+nD))

Optimal Approach

- Uses binary search on the answer.
- Calculates "mid" to test a candidate distance.
- If possible, searches for a larger distance by updating "low = mid + 1".
- If impossible, searches for a smaller distance by updating "high = mid - 1".
- Returns "high", the maximum feasible distance.
- Time Complexity: (O(n\log n+n\log D))

Main Difference

Both approaches use the same greedy feasibility check to place cows. The difference is how they search for the maximum minimum distance: brute force checks distances one by one, while binary search eliminates half of the remaining search space in each iteration.

Important Edge Cases

- Two cows: The answer is the difference between the maximum and minimum stall positions.
- Duplicate positions: The answer may be "0".
- Impossible placement: If "k" is greater than the number of stalls, placement is impossible; handle this according to the problem's constraints.
- Sorting: Sorting is necessary so the greedy placement check can process stall positions in order.

Key Takeaway

Aggressive Cows is a classic Binary Search on Answer + Greedy problem.

- Brute force checks candidate distances from largest to smallest.
- The optimal approach uses binary search to reduce the number of candidate distances.
- The greedy helper checks whether a candidate distance is feasible.

Pattern to remember: Maximize the minimum distance → sort → greedy feasibility check → binary search on the answer.
