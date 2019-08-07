package code401challenges;

import java.util.Arrays;

public class ArrayShift {
  public static void main(String[] args){
    int[] inputArr = new int[]{4,8,15,23,42};
    System.out.println(Arrays.toString(insertShiftArray(inputArr, 16)));
  }

  public static int[] insertShiftArray(int[] arrToShift, int intToAdd){
    int[] newArr = new int[arrToShift.length+1];
    double midIndex = Math.floor(arrToShift.length/2);
    for(int i = 0; i < midIndex; i++){
      newArr[i] = arrToShift[i];
    }
    newArr[(int)midIndex] = intToAdd;
    for(int j = (int)midIndex + 1; j <= arrToShift.length; j++){
      newArr[j] = arrToShift[j-1];
    }
    return newArr;
  }
}
