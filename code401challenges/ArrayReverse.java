import java.util.Arrays;

public class ArrayReverse {
  public static void main(String[] args){
    int[] toBeReversed = new int[]{1,2,3,4,5};
    System.out.println(Arrays.toString(reverseArray(toBeReversed)));
  }
  public static int[] reverseArray(int[] arr){
    if (arr.length <= 1) {
      return arr;
    } else {
      int index = 0;
      for ( int i = arr.length - 1; i >= 0; i-- ){
        if (index == i){
          break;
        }
        if(i - index == 1){
          break;
        }
        int temp = arr[index];
        arr[index] = arr[i];
        arr[i] = temp;
        index++;
      }
    } 
    return arr;
  }
}


// First solution - pair whiteboarding solution
// public static int[] reverseArray(int[] arr){
//   if (arr.length <= 1) {
//     return arr;
//   } else {
//     int[] newArr = new int[arr.length];
//     int index = 0;
//     for ( int i = arr.length - 1; i >= 0; i-- ){
//       newArr[index] = arr[i];
//       index++;
//     }
//     return newArr;
//   }
// }