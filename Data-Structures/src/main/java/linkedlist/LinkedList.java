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
    current.next = new Node(value, null);
  }

  public void insertBefore(T value, T target){
    if(head == null){
      head = new Node(value, null);
    }
    this.current = head;
    while(current != null) {
      if(current.next.value == target){
        current.next = new Node(value, this.current.next);
      }
      break;
    }
  }

  public void insertAfter(T value, T target){
    if(head == null){
      head = new Node(value, null);
    }
    this.current = head;
    while(current != null){
      if(current.next.value == target){
        current = current.next;
        current.next = new Node(value, current.next);
      }
      break;
    }
  }

  public String kthFromEnd(int k){
    this.current = head;
    int length = 0;
    while(this.current != null) {
      this.current = current.next;
      length++;
    }
    if(length < k){
      return "Not there";
    }
    this.current = head;
    for(int i = 1; i < length - k; i++){
      current = current.next;
    }
    return current.value.toString();
  }

}

