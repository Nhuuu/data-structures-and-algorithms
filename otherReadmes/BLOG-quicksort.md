# Quick Sort
One of the most efficient sorting algorithms. Uses the divide-and-conquer approach based on the idea of choosing one element as a pivot element and partitioning the array around it such that: Left side of pivot contains all the elements that are less than the pivot element Right side contains all elements greater than the pivot. Can be about two or three times faster than its main competitors, merge sort and heapsort.
* Worst case, it makes O(n2) comparisons, though this is rare.


## Learning Objectives
Students will learn how to implement a quick sort algorithm on a list.

### Diagram
![Quick Image](quick-sort.png)

### Algorithm
Quicksort first divides a large array into two smaller sub-arrays: the low elements and the high elements. Quicksort can then recursively sort the sub-arrays.

### Pseudocode

ALGORITHM QuickSort(arr, left, right)
    if left < right
        // Partition the array by setting the position of the pivot value 
        DEFINE position <-- Partition(arr, left, right)
        // Sort the left
        QuickSort(arr, left, position - 1)
        // Sort the right
        QuickSort(arr, position + 1, right)

ALGORITHM Partition(arr, left, right)
    // set a pivot value as a point of reference
    DEFINE pivot <-- arr[right]
    // create a variable to track the largest index of numbers lower than the defined pivot
    DEFINE low <-- left - 1
    for i <- left to right do
        if arr[i] <= pivot
            low++
            Swap(arr, i, low)

     // place the value of the pivot location in the middle.
     // all numbers smaller than the pivot are on the left, larger on the right. 
     Swap(arr, right, low + 1)
    // return the pivot index point
     return low + 1

ALGORITHM Swap(arr, i, low)
    DEFINE temp;
    temp <-- arr[i]
    arr[i] <-- arr[low]
    arr[low] <-- temp


### Readings and References
* Watch
  * https://www.youtube.com/watch?v=SLauY6PpjW4

* Read
  * https://www.tutorialspoint.com/data_structures_algorithms/quick_sort_algorithm.htm
  * https://www.hackerearth.com/practice/algorithms/sorting/quick-sort/tutorial/


* [Link to code](../code401challenges/src/main/java/code401challenges/QuickSort.java)
* [Link to tests](../code401challenges/src/test/java/code401challenges/QuickSortTest.java)