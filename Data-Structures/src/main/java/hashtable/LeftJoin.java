package hashtable;

import java.util.HashMap;

public class LeftJoin {

  public static HashMap<String, String[]> leftJoin(HashMap<String, String> hm1, HashMap<String, String> hm2){
    HashMap<String, String[]> result = new HashMap<>();
    if(hm2.isEmpty()){
      for(String k : hm1.keySet()){
        String[] values = new String[]{hm1.get(k), null};
        result.put(k, values);
      }
    }
    if(!hm1.isEmpty() && !hm2.isEmpty()){
      for(String k : hm2.keySet()){
        if(hm1.containsKey(k)){
          String[] values = new String[]{hm1.get(k), hm2.get(k)};
          result.put(k, values);
        }
      }
    }
    return result;
  }

}