package stacksandqueues;

public class Stack<T> {
  Node<T> top;

  public Stack() {
  }

  public void push(T value) {
    Node <T> temp;
    if (top == null){
      top = new Node(value, null);
    }
    else {
      temp = top;
      top = new Node(value, temp);
    }
  }

  public T pop() {
    Node <T> temp;
    if(top == null){
      throw new NullPointerException("Stack is empty");
    } else {
      temp = top;
      top = top.next;
      temp.next = null;
    }
    return temp.value;
  }

  public T peek() {
    if(top == null){
      throw new NullPointerException("Stack is empty");
    } else {
      return top.value;
    }
  }
  
}
