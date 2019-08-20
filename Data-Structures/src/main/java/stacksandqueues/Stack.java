package stacksandqueues;

public class Stack<T> {
  protected Node<T> top;

  public Stack() {
    this.top = null;
  }

  public void push(T value) {
    Node <T> temp = top;
    this.top = new Node(value, temp);
  }

  public T pop() {
    Node <T> temp;
    if(this.top == null){
      throw new NullPointerException("Stack is empty");
    } else {
      temp = this.top;
      this.top = this.top.next;
      temp.next = null;
    }
    return temp.getValue();
  }

  public T peek() {
    if(this.top == null){
      throw new NullPointerException("Stack is empty");
    } else {
      return this.top.getValue();
    }
  }

}
