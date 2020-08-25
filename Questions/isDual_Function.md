# IsDual Function

## Question Statement

**An array is said to be *dual*** if it has an even number of elements and each pair of consecutive even and odd elements sum to the same value. Write a function named **isDual** that accepts an array of integers and returns 1 if the array is dual, otherwise it returns 0.

If you are programming in Java or C#, the function signature is int isDual(int[] a)
If you are programming in C or C++, the function signature is int isDual(int a[], int len) where len is the number of elements in the array

Examples
| if the input array is | return |
| --- | --- |
| {1, 2, 3, 0} | 1 (because 1+2 == 3+0 == 3) |
| {1, 2, 2, 1, 3, 0} | 1 (because 1+2 == 2+1 == 3+0 == 3) |
| {1, 1, 2, 2} | 0 (because 1+1 == 2 != 2+2) |
| {1, 2, 1} | 0 (because array does not have an even number of elements) |
| {} | 1 |

[Go to Answers](https://github.com/aimamisa/practice_questions/Questions/Answers/isDual_Function) to view it in the browser.