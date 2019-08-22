package utilities;

public class MultiBracketValidation {

  public static boolean multiBracketValidation(String input){
    String[] openers = new String[]{"(", "[", "{"};
    String[] closers = new String[]{")", "]", "}"};
    String[] inputArr = input.split("");
    boolean flag = false;
    int index = 0;
    if(inputArr.length % 2 == 1) {
      flag = false;
    } else if(inputArr[index].equals(openers[0]) || inputArr[index].equals(openers[1]) || inputArr[index].equals(openers[2])){
      for(int i = 1; i < inputArr.length; i++){
        if(inputArr[i].equals(closers[0]) || inputArr[i].equals(closers[1]) || inputArr[i].equals(closers[2])){
          flag = false;
        } else {

        }
        if(inputArr[i].equals(inputArr[index])){

        }
      }
    }
    return flag;
  }


}
