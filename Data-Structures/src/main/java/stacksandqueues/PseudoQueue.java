package stacksandqueues;

public class PseudoQueue<T> {
  Stack<T> firstStack;
  Stack<T> secondStack;

  public PseudoQueue() {
    this.firstStack = new Stack();
    this.secondStack = new Stack();
  }

  public void enqueue(T value) {
    Node<T> newNode = new Node(value);
    this.firstStack.push((T) newNode);
  }

  public T dequeue() {
    Node<T> front = this.secondStack.top;
    if(front == null){
      while(this.firstStack.top != null){
        this.secondStack.push(this.firstStack.pop());
      }
    }
    return secondStack.pop();
  }

}
