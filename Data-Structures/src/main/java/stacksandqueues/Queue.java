package stacksandqueues;

public class Queue<T> {
  Node<T> front;
  Node<T> rear;
  public Queue() {
  }

  public void enqueue(T value) {
    Node<T> newNode = new Node(value, null);
    if(rear == null) {
      front = newNode;
      rear = newNode;
    } else {
      rear.next = newNode;
      rear = newNode;
    }
  }

  public T dequeue() {
    Node<T> temp;
    if(front == null) {
      throw new NullPointerException("Queue is empty");
    } else {
      temp = front;
      front = front.next;
      temp.next = null;
    }
    return temp.value;
  }

  public T peek() {
    if(front == null) {
      throw new NullPointerException("Queue is empty");
    }
    return front.value;
  }

}
