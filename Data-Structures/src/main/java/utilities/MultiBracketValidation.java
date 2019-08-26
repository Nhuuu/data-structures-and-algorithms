package utilities;

import stacksandqueues.Stack;

public class MultiBracketValidation {

  public static boolean validate(String input){
    Stack<Character> openBrackets = new Stack<>();
    for(int i = 0; i < input.length(); i++){
      char current = input.charAt(i);
      if(current == '(' || current == '[' || current == '{'){
        openBrackets.push(current);
      } else if (current == ')' && openBrackets.peek() == '(' || current == ']' && openBrackets.peek() == '[' || current == '}' && openBrackets.peek() == '{'){
        openBrackets.pop();
      } else {
        return false;
      }
    }
    return openBrackets.isEmpty();
  }

}
