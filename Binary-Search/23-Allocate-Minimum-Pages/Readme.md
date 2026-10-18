 Allocate Minimum Pages

Problem

You are given an array "arr", where "arr[i]" represents the number of pages in the "i-th" book, and an integer "k" representing the number of students.

Allocate books to students such that:

- Each student gets at least one book.
- Each book is allocated to exactly one student.
- Books must be allocated in contiguous order.
- The maximum number of pages assigned to any student is minimized.

If it is impossible to allocate books to all "k" students, return "-1".

Problem Link

"GeeksforGeeks – Allocate Minimum Pages" (https://www.geeksforgeeks.org/problems/allocate-minimum-number-of-pages0937/1)

Example

Input:

arr = [10, 20, 30, 40], k = 2

Output:

60

Explanation: One optimal allocation is:

- Student 1: Books with 10, 20, and 30 pages. Total = 60 pages.
- Student 2: Book with 40 pages. Total = 40 pages.

The maximum pages assigned to a student is "max(60, 40) = 60".

Therefore, the minimum possible maximum number of pages is "60".

Approach

- If "k > arr.length", return "-1", because every student must receive at least one book.
- Use Binary Search to search for the minimum possible maximum number of pages.
- Set "low" to the maximum number of pages in a single book.
- Set "high" to the sum of all book pages.
- For each middle page limit, count the number of students required using a greedy approach.
- If the number of students required is at most "k", the allocation is possible, so search for a smaller page limit.
- Otherwise, search for a larger page limit.
- Continue until the minimum feasible page limit is found.

Complexity Analysis

- Time Complexity: "O(n × log(S))"
- Space Complexity: "O(1)"

Here, "n" is the number of books and "S" is the sum of all book pages.

Topic

Binary Search on Answers

Language

Java