package stacksandqueues;

public class Node <T> {
  T value;
  Node<T> next;

  public Node(T value, Node next) {
    this.value = value;
    this.next = next;
  }
}
