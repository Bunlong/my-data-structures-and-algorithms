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

3- Write a function to reverse an integer using numeric operators and without using any arrays or other data structures.

The signature of the function is `int f(int n)`

| if the input integer is | return |
|:-------------|:-------------|
| 1234 | 4321 |
| 12005 | 50021 |
| 1 | 1 |
| 1000 | 1 |
| 0 | 0 |
| -12345 | -54321 |

Solutions:

4- Write a function that:
  
  * accepts a character array, a zero-based start position and a length
  * it should return a character array containing length characters starting with the start character of the input array.
  * the function should do error checking on the start position and the length and return null if the either value is not legal.

The function signature is `char[] f(char[] a, int start, int len)`

| if input parameters are | return |
|:-------------|:-------------|
| {'a', 'b', 'c'}, 0, 4 | null |
| {'a', 'b', 'c'}, 0, 3 | {'a', 'b', 'c'} |
| {'a', 'b', 'c'}, 0, 2 | {'a', 'b'} |
| {'a', 'b', 'c'}, 0, 1 | {'a'} |
| {'a', 'b', 'c'}, 1, 3 | null |
| {'a', 'b', 'c'}, 1, 2 | {'b', 'c'} |
| {'a', 'b', 'c'}, 1, 1 | {'b'} |
| {'a', 'b', 'c'}, 2, 2 | null |
| {'a', 'b', 'c'}, 2, 1 | {'c'} |
| {'a', 'b', 'c'}, 3, 1 | null |
| {'a', 'b', 'c'}, 1, 0 | {} |
| {'a', 'b', 'c'}, -1, 2 | null |
| {'a', 'b', 'c'}, -1, -2 | null |
| {}, 0, 1 | null |

Solutions:
