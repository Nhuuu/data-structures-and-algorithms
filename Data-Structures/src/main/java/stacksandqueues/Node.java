package stacksandqueues;

public class Node <T> {
  protected T value;
  protected Node<T> next;

  public Node(T value, Node next) {
    this.value = value;
    this.next = next;
  }

  public Node(T value) {
    this(value, null);
  }

  public T getValue(){
    return this.value;
  }

}
