# Day 03 - Quick Sort

This folder contains my Day 03 DSA solution using the Quick Sort algorithm in Java.

## Problem Statement

Sort an array of integers using the Quick Sort technique.

## Approach

* Quick Sort is a **divide and conquer** sorting algorithm.
* It picks a **pivot** element and partitions the array:

  * elements smaller than the pivot go to its left
  * elements larger than the pivot go to its right
* Then it recursively applies the same logic to the left and right parts until everything is sorted.

## Explanation of the Code

* The `quicksort` function takes the array, the starting index (`low`), and the ending index (`high`).

  * It divides the array around a pivot
  * Then it recursively sorts the left and right subarrays
* The `partition` function:

  * Chooses the last element as the pivot
  * Moves all smaller elements to the left
  * Swaps the pivot into its correct position
  * Returns the pivot index
* The `main` function:

  * Creates the array `{5,2,9,1,7,3,6}`
  * Calls `quicksort()` on the array
  * Prints the sorted result

## Output

1 2 3 5 6 7 9
