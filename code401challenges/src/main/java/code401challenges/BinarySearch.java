package code401challenges;

public class BinarySearch {
  public static void main(String[] args){
    int[] inputArr = {4,8,15,16,23,42};
    System.out.println(binarySearch(inputArr, 15));
  }

  public static int binarySearch(int[] sortedArr, int target){
    int midIndex = sortedArr.length/2;
    while(midIndex < sortedArr.length && midIndex > 0){
      if(sortedArr[midIndex] == target){
        return midIndex;
      } else if(sortedArr[midIndex] < target){
        midIndex = (midIndex + sortedArr.length)/2;
      } else if(sortedArr[midIndex] > target){
        midIndex = midIndex/2;
      } else {
        return -1;
      }
    }
    return midIndex;
  }
}
