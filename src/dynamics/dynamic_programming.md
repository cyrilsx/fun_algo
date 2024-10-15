# Dynamic programming

Dynamic programming is a method for solving a complex problem by breaking it down into simpler subproblems. It is applicable when the subproblems are not independent, i.e., when subproblems share subsubproblems. 
We also call it overlapping subproblems. It is important not to confuse it with divide and conquer, which is applicable when the subproblems are independent, i.e., when subproblems do not share subproblems.

A dynamic programming algorithm solves every subsubproblem just once and then saves its answer in a table, thereby avoiding the work of recomputing the answer every time the subsubproblem is encountered.



```
Dad: *Writes down “1+1+1+1+1+1+1+1 =” on a sheet of paper*
Dad: What’s that equal to?
Kid: *counting and 3 seconds later* Eight!
Dad: *Writes down another “+1” on the left*
Dad: What about now?
Kid: *instantly* Nine!
Dad: Wow, how did you calculate so fast?
Kid: You just added one more!
Dad: So you didn’t need to recount because you remembered it was eight before. Brilliant!
```

## Fibonacci Series

The Fibonacci series is a series of numbers in which each number is the sum of the two preceding ones, usually starting with 0 and 1. The sequence goes: 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, and so on.
For more information, click [here](src/dynamics/FibonacciSeries.md).

## Climbing Stairs or ChildRunning (easy)

You are climbing a staircase. It takes n steps to reach the top. Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?
For more information, click [here](src/dynamics/ChildRunning.md).
