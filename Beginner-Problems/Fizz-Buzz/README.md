FizzBuzz

Problem Statement

Given an integer "n", print the following output based on these conditions:

- Print "FizzBuzz" if "n" is divisible by both 3 and 5.
- Print "Fizz" if "n" is divisible by 3 only.
- Print "Buzz" if "n" is divisible by 5 only.
- Otherwise, print the integer itself.

Problem Link

"GeeksforGeeks — FizzBuzz" (https://www.geeksforgeeks.org/problems/fizz-buzz/1)

Difficulty

Easy

Approach

1. Read the integer "n" from the input.
2. Check whether "n" is divisible by both 3 and 5.
3. If not, check whether "n" is divisible by 3.
4. Otherwise, check whether "n" is divisible by 5.
5. If none of the conditions are satisfied, print "n".

Sample Input

15

Sample Output

FizzBuzz

Concepts Learned

- User input using "Scanner"
- Conditional statements ("if", "else if", "else")
- Modulus operator ("%")
- Checking divisibility
- Order of conditional checks

Complexity Analysis

- Time Complexity: O(1)
- Space Complexity: O(1)
