# Merge Sort
One of the most efficient sorting algorithms. Merge sort repeatedly breaks down into several sublists until each sublist is a single element and then merges those sublists until it is one sorted list.
* Worst-case time complexity being Ο(n log n)

## Learning Objectives
Students will learn how to implement a merge sort algorithm on a list.

### Diagram
![Merge Image](merge-sort.png)

### Algorithm
Divide the unsorted list into n sublists, each containing one element.
Repeatedly merge sublists to produce new sorted sublists until there is only one sublist remaining. This is the sorted list.

### Pseudocode

ALGORITHM Mergesort(arr)
    DECLARE n <-- arr.length
           
    if n > 1
      DECLARE mid <-- n/2
      DECLARE left <-- arr[0...mid]
      DECLARE right <-- arr[mid...n]
      // sort the left side
      Mergesort(left)
      // sort the right side
      Mergesort(right)
      // merge the sorted left and right sides together
      Merge(left, right, arr)

ALGORITHM Merge(left, right, arr)
    DECLARE i <-- 0
    DECLARE j <-- 0
    DECLARE k <-- 0

    while i < left.length && j < right.length
        if left[i] <= right[j]
            arr[k] <-- left[i]
            i <-- i + 1
        else
            arr[k] <-- right[j]
            j <-- j + 1
            
        k <-- k + 1

    if i = left.length
       set remaining entries in arr to remaining values in right
    else
       set remaining entries in arr to remaining values in left


### Readings and References
* Watch
  * https://www.youtube.com/watch?v=KF2j-9iSf4Q

* Read
  * https://www.interviewbit.com/tutorial/merge-sort-algorithm/
  * https://www.tutorialspoint.com/data_structures_algorithms/merge_sort_algorithm.htm


* [Link to code](../code401challenges/src/main/java/code401challenges/MergeSort.java)
* [Link to tests](../code401challenges/src/test/java/code401challenges/MergeSortTest.java)