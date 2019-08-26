package tree;

public class Node <Integer> {
  int value;
  Node<Integer> left;
  Node<Integer> right;

  public Node(int value, Node left, Node right) {
    this.value = value;
    this.left = left;
    this.right = right;
  }

  public Node(int value) {
    this(value, null, null);
  }

  public int getValue(){
    return this.value;
  }

}
