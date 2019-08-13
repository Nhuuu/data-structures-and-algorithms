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

  public void append(T value){
    if(head == null){
      head = new Node(value, null);
      return;
    }
    this.current = head;
    while(this.current.next != null){
      this.current = current.next;
    }
    Node <T> newNode = new Node(value, null);
    current.next = newNode;
  }

  public void insertBefore(T value, T target){
    if(head == null){
      head = new Node(value, null);
    }
    this.current = head;
    while(current.next != null){
      if(current.value == target){
        Node newNode = new Node(value, current);
        current.next = newNode;
      }
      current = current.next;
    }
  }

  public void insertAfter(T value, T target){
    if(head == null){
      head = new Node(value, null);
    }
    this.current = head;
    while(current.next != null){
      if(current.value == target){
        Node newNode = new Node(value, current.next);
        current.next = newNode;
      }
    }
  }

}

