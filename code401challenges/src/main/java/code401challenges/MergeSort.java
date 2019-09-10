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
  public static int[] merge(int[] left, int[] right, int[] arr){
    int i = 0; int j = 0; int k = 0;
    while(i < left.length && j < right.length){
      if(left[i] <= right[j]){
        arr[k] = left[i];
        i = i + 1;
      } else {
        arr[k] = right[j];
        j = j + 1;
      }
      k = k + 1;
    }
    while(i < left.length){
      arr[k++] = left[i++];
    }
    while(j < right.length){
      arr[k++] = right[j++];
    }
    return arr;
  }
}
