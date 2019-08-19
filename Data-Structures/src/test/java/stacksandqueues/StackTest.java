package stacksandqueues;

import org.junit.*;
import static org.junit.Assert.*;

public class StackTest {

  Stack stack;
  @Before
  public void setUp(){
    stack = new Stack();
  }
  @Test
  public void testEmptyStack(){
    assertEquals("Should initialize new empty stack", null, stack.top);
  }

  @Test
  public void testPushToStack(){
    stack.push(5);
    assertEquals("Stack should have a node with value of 5", 5, stack.top.value);
  }

  @Test
  public void testPushMultipleToStack(){
    stack.push(5);
    stack.push(4);
    stack.push(3);
    stack.push(2);
    int length = 0;
    while (stack.top != null){
      stack.top = stack.top.next;
      length++;
    }
    assertEquals("Should have 4 nodes in the stack now", 4, length);
  }

  @Test
  public void testPopOffStack(){
    stack.push(5);
    stack.pop();
    assertEquals("Should now be an empty stack", null, stack.top);
  }

  @Test
  public void testEmptyStackAfterMultiplePops(){
    stack.push(5);
    stack.push(4);
    stack.push(3);
    stack.pop();
    stack.pop();
    stack.pop();
    assertEquals("Should now be an empty stack", null, stack.top);
  }

  @Test
  public void testPeekStack(){
    stack.push(5);
    assertEquals("Should peek at the top value and get back 5", 5, stack.peek());
  }
}
