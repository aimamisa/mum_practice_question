# IsCentered Function

## Question Statement

**An array with an odd number of elements is said to be *centered*** if all elements (except the middle one) are strictly greater than the value of the middle element. Note that only arrays with an odd number of elements have a middle element (a[a.length/2]).

Write a function named **isCentered** that accepts an integer array and returns 1 if it is a centered array, otherwise it returns 0.

If you are programming in Java or C#, the function signature is int isCentered(int[ ] a)
If you are programming in C or C++, the function signature isint isCentered(int a[ ], int len) where len is the number of elements in the array

Examples
| if the input array is | return |
| --- | --- |
| {1, 2, 3, 4, 5} | 0 (the middle element 3 is not strictly less than all other elements) |
| {3, 2, 1, 4, 5} | 1 (the middle element 1 is strictly less than all other elements) |
| {3, 2, 1, 4, 1} | 0 (the middle element 1 is not strictly less than all other elements) |
| {3, 2, 1, 1, 4, 6} | 0 (no middle element since array has even number of elements) |
| {} | 0 (no middle element) |
| {1} | 1 (satisfies the condition vacuously) |

[Go to Answers](https://github.com/aimamisa/practice_questions/tree/MIU_Test_Questions/Questions/Answers/isCentered_Function/) to view it in the browser.