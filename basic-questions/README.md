<!-- 

javac filename.java
java filename

-->

1- Write a function that:

* takes an array of integers as an argument
* and returns a value based on the sums of the even and odd numbers in the array
* let X = the sum of the odd numbers in the array
* and let Y = the sum of the even numbers
* The function should return X - Y

The signature of the function is `int f(int[] a)`

| if input array is | return |
|:-------------|:-------------|
| {1} | 1 |
| {1, 2} | -1 |
| {1, 2, 3} | 2 |
| {1, 2, 3, 4} | -2 |
| {3, 3, 4, 4} | -2 |
| {3, 2, 3, 4} | 0 |
| {4, 1, 2, 3} | -2 |
| {1, 1} | 2 |
| {} | 0 |

Solutions:

2- Write a function that:

* accepts an array of non-negative integers
* and returns the second largest integer in the array
* return -1 if there is no second largest

The signature of the function is `int f(int[] a)`

| if the input array is | return |
|:-------------|:-------------|
| {1, 2, 3, 4} | 3 |
| {4, 1, 2, 3} | 3 |
| {1, 1, 2, 2} | 1 |
| {1, 1} | -1 |
| {1} | -1 |
| {} | -1 |

Solutions:
