package tree;

public class Node <T> {
  T value;
  Node<T> left;
  Node<T> right;

  public Node(T value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public Node(T value) {
    this(value, null, null);
  }

  public T getValue(){
    return this.value;
  }

}
