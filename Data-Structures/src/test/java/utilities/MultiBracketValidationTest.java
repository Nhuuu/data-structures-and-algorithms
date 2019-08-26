package utilities;

import org.junit.Test;

import static org.junit.Assert.*;

public class MultiBracketValidationTest {

  @Test
  public void multiBracketValidation_1() {
    String b = "{}";
    assertTrue(MultiBracketValidation.validate(b));
  }

  @Test
  public void multiBracketValidation_2() {
    String b = "{}(){}";
    assertTrue(MultiBracketValidation.validate(b));
  }

  @Test
  public void multiBracketValidation_3() {
    String b = "(){}[[]]";
    assertTrue(MultiBracketValidation.validate(b));
  }

  @Test
  public void multiBracketValidation_4() {
    String b = "[({}]";
    assertFalse(MultiBracketValidation.validate(b));
  }

  @Test
  public void multiBracketValidation_5() {
    String b = "(](";
    assertFalse(MultiBracketValidation.validate(b));
  }

  @Test
  public void multiBracketValidation_6() {
    String b = "{(})";
    assertFalse(MultiBracketValidation.validate(b));
  }
}