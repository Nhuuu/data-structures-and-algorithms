package hashtable;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class HashtableTest {

  Hashtable h;
  @Before
  public void setup(){
    h = new Hashtable(1024);
  }

  @Test
  public void add() {
    h.add("Hello", "Abby");
    assertEquals("Abby", h.get("Hello"));
    assertTrue(h.contains("Hello"));
  }

  @Test
  public void get() {
    h.add("Hello", "Abby");
    h.add("Hello", "Tilly");
    assertEquals("Tilly", h.get("Hello"));
  }

  @Test
  public void getNull(){
    assertEquals(null, h.get("Hello"));
  }

  @Test
  public void contains_true() {
    h.add("Hello", "Abby");
    assertTrue(h.contains("Hello"));
  }

  @Test
  public void contains_false() {
    assertFalse(h.contains("Hello"));
  }
}