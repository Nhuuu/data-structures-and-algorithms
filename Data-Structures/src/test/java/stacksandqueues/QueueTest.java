package stacksandqueues;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class QueueTest {

  Queue queue;
  @Before
  public void setUp(){
    queue = new Queue();
  }

  @Test
  public void testInitializeQueue(){
    assertEquals("Should initialize new empty queue", null, queue.front);
  }

  @Test
  public void testEnqueue(){
    queue.enqueue(5);
    assertEquals("Stack should have a node with value of 5", 5, queue.front.getValue());
  }

  @Test
  public void testEnqueueMultiple(){
    queue.enqueue(5);
    queue.enqueue(4);
    queue.enqueue(3);
    queue.enqueue(2);
    int length = 0;
    while (queue.front != null){
      queue.front = queue.front.next;
      length++;
    }
    assertEquals("Should have 4 nodes in the queue now", 4, length);
  }

  @Test
  public void testDequeue(){
    queue.enqueue(5);
    assertEquals("Should now be an empty queue", 5, queue.dequeue());
  }

  @Test
  public void testDequeue_stillFrontNode(){
    queue.enqueue(5);
    queue.enqueue(4);
    queue.dequeue();
    assertEquals("Should now have one front node", 4, queue.front.getValue());
  }

  @Test
  public void testEmptyQueueAfterMultipleDequeues(){
    queue.enqueue(5);
    queue.enqueue(4);
    queue.enqueue(3);
    queue.dequeue();
    queue.dequeue();
    queue.dequeue();
    assertEquals("Should now be an empty queue", null, queue.front);
  }

  @Test
  public void testPeekQueue(){
    queue.enqueue(5);
    assertEquals("Should peek at the front value and get back 5", 5, queue.peek());
  }
}