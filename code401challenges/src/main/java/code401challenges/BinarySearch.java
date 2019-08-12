package code401challenges;

public class BinarySearch {
  public static void main(String[] args){
    int[] inputArr = {4,8,15,16,23,42};
    System.out.println(binarySearch(inputArr, 23));
  }

  public static int binarySearch(int[] arr, int target){
    int minIndex = 0;
    int maxIndex = arr.length - 1;
    int guessIndex = (minIndex + maxIndex) / 2;
    while(minIndex <= maxIndex ){
      if(arr[guessIndex] == target){
        return guessIndex;
      }
      else if(arr[guessIndex] > target){
        maxIndex = guessIndex - 1;
      }
      else if(arr[guessIndex] < target){
        minIndex = guessIndex + 1;
      }
    }
    return -1;
  }
}
