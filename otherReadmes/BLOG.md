# Insertion Sort
In-place comparison-based sorting algorithm that sorts a list one item at a time. It is less efficient on large lists than other sorting algorithms such as quick sort, heap sort, and merge sort but more efficient than bubble sort and selection sort.
* A few advantages of insertion:
  * Adaptive: efficient for data sets that are already substantially sorted or for small data sets.
  * Stable: does not change if the values are equal.
  * In-place: requires constant space O(1).

## Learning Objectives
Students will learn how to implement an insertion sort algorithm.

### Information Flow
* Main Point
  * Supporting points

* Another main point
  * More details

### Diagram
![]()

### Algorithm
Insertion sort iterates through the list. If it is the first element, it's already sorted and returns 1. On to the next element, it compares that element with all the elements in the sorted sub-list and swaps that value each time an item in the sub-list is greater than that element's value. This repeats until the entire list is sorted.

### Pseudocode

InsertionSort(int[] arr)

  FOR i = 1 to arr.length
  
    int j <-- i - 1
    int temp <-- arr[i]
    
    WHILE j >= 0 AND temp < arr[j]
      arr[j + 1] <-- arr[j]
      j <-- j - 1
      
    arr[j + 1] <-- temp

### Readings and References
* Watch
  * https://www.youtube.com/watch?v=BO145HIUHRg

* Read
  * https://www.geeksforgeeks.org/insertion-sort/
  * https://www.tutorialspoint.com/data_structures_algorithms/insertion_sort_algorithm.htm
