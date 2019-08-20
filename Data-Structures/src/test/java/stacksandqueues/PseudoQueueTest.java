package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class PseudoQueueTest {

  PseudoQueue pseudoQueue;
  @Before
  public void setUp() {
    pseudoQueue = new PseudoQueue();
  }

  @Test
  public void testEnqueue_length(){
    pseudoQueue.enqueue(20);
    pseudoQueue.enqueue(15);
    pseudoQueue.enqueue(10);
    int length = 0;
    while (pseudoQueue.firstStack.top != null){
      pseudoQueue.firstStack.top = pseudoQueue.firstStack.top.next;
      length++;
    }
    assertEquals("Should have 3 nodes in the pseudo queue.", 3, length);
  }

  @Test
  public void testEnqueue_value() {
    pseudoQueue.enqueue(5);
    assertEquals("Should be able to enqueue FIFO", 5, pseudoQueue.firstStack.peek());
  }

  @Test
  public void testDequeuePseudoQueue() {
    pseudoQueue.enqueue(20);
    pseudoQueue.enqueue(15);
    pseudoQueue.enqueue(10);
    assertEquals("Should be able to dequeue FIFO", 20, pseudoQueue.dequeue());
  }
}