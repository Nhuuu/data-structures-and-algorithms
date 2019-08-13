package linkedlist;

public class LinkedList<T> {
  Node head;
  Node <T> current;
  
  public void insert(T value){
    Node <T> current = new Node(value, this.head);
    this.head = current;
  }

  public boolean includes(T value){
    Node <T> current = this.head;
    while(current != null){
      if(current.value == value) {
        return true;
      }
      current = current.next;
    }
    return false;
  }

  public String toString(){
    String allTheThings = "HEAD";
    Node <T> current = this.head;
    while(current != null){
      allTheThings = allTheThings + " -> " + current.value;
      current = current.next;
    }
    allTheThings = allTheThings + " -> " + null;
    return allTheThings;
  }

}

