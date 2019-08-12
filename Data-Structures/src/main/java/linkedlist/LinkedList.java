package linkedlist;

import java.util.ArrayList;
import java.util.List;

public class LinkedList {
  public Node head;
  public Node current;

  public void insert(String value){
    if(head == null){
      head = new Node(value);
      return;
    }
    head.next = new Node(value);
  }

  public boolean includes(String value){
    current = head;
    while(current != null){
      if(current.value == value) {
        return true;
      }
    }
    return false;
  }

  public List<String> printString(){
    List<String> allTheThings = new ArrayList<>();
    current = head;
    while(current != null){
      allTheThings.add(current.value);
      current = current.next;
    }
    return allTheThings;
  }

}
