package linkedlist;

public class Node <T>{
  Node <T> next;
  T value;

  public Node(T value, Node next){
    this.value = value;
    this.next = next;
  }

}
