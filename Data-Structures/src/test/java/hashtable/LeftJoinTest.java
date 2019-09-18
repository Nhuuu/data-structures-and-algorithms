package hashtable;

import org.junit.Before;
import org.junit.Test;

import java.util.Arrays;
import java.util.HashMap;

import static org.junit.Assert.*;

public class LeftJoinTest {

  HashMap<String, String> hm_empty;
  HashMap<String, String> hm1;
  HashMap<String, String> hm2;
  @Before
  public void setUp(){
    hm_empty = new HashMap<>();
    hm1 = new HashMap<>();
    hm2 = new HashMap<>();

    hm1.put("fond", "enamored");
    hm1.put("wrath", "anger");
    hm1.put("diligent", "employed");
    hm1.put("outfit", "garb");
    hm1.put("guide", "usher");

    hm2.put("fond", "averse");
    hm2.put("wrath", "delight");
    hm2.put("diligent", "idle");
    hm2.put("guide", "follow");
    hm2.put("flow", "jam");
  }

  @Test
  public void leftJoin() {
    String expected = "diligent = [employed, idle] wrath = [anger, delight] guide = [usher, follow] fond = [enamored, averse] ";
    HashMap<String, String[]> result = LeftJoin.leftJoin(hm1, hm2);
    String resultString = "";
    for(String k : result.keySet()){
      resultString += k + " = " + Arrays.toString(result.get(k)) + " ";
    }
    System.out.println(resultString);
    assertEquals(expected, resultString);
  }

  @Test
  public void leftJoin_hm1_empty() {
    HashMap<String, String[]> expected = new HashMap<>();
    HashMap<String, String[]> result = LeftJoin.leftJoin(hm_empty, hm2);
    assertEquals(expected, result);
  }

  @Test
  public void leftJoin_hm2_empty() {
    String expected = "diligent = [employed, null] outfit = [garb, null] wrath = [anger, null] guide = [usher, null] " +
        "fond = [enamored, null] ";
    HashMap<String, String[]> result = LeftJoin.leftJoin(hm1, hm_empty);
    String resultString = "";
    for(String k : result.keySet()){
      resultString += k + " = " + Arrays.toString(result.get(k)) + " ";
    }
    System.out.println(resultString);
    assertEquals(expected, resultString);
  }
}