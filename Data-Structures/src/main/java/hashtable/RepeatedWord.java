package hashtable;

import java.util.HashSet;
import java.util.Set;

public class RepeatedWord {

  public static String repeatedWord(String input){
    if(input != ""){
      Set<String> words = new HashSet<>();
      String[] splitWords = input.toLowerCase().split("\\W+");
      for(String word : splitWords){
        if(words.contains(word)){
          return word;
        } else {
          words.add(word);
        }
      }
      return "'" + splitWords[0] + "'" + " only appears once, there are no repeated words yet.";
    }
    return null;
  }


}
