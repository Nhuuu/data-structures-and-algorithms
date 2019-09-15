package code401challenges;

import java.util.Arrays;

public class MergeSort {

  public static int[] mergeSort(int[] arr){
    int n = arr.length;
    if(n > 1){
      int mid = n/2;
      int[] left = Arrays.copyOfRange(arr, 0, mid);
      int[] right = Arrays.copyOfRange(arr, mid, n);
      mergeSort(left);
      mergeSort(right);
      arr = merge(left, right, arr);
    }
    return arr;
  }

  // merge helper method
  public static int[] merge(int[] arr1, int[] arr2, int[] arr){
    int i = 0; int j = 0; int k = 0;
    while(i < arr1.length && j < arr2.length){
      if(arr1[i] <= arr2[j]){
        arr[k] = arr1[i];
        i = i + 1;
      } else {
        arr[k] = arr2[j];
        j = j + 1;
      }
      k = k + 1;
    }
    while(i < arr1.length){
      arr[k++] = arr1[i++];
    }
    while(j < arr2.length){
      arr[k++] = arr2[j++];
    }
    return arr;
  }
}
