package utilities;

import java.util.LinkedList;
import java.util.List;

public class AnimalShelter<T> {
//  List<Animal> animals;
  Node<T> front;
  Node<T> rear;

  public AnimalShelter(){
    this.front = null;
    this.rear = null;
//    this.animals = new LinkedList<>();
  }

  public void enqueue(Animal animal){
    Node<T> newNode = new Node(animal);
    if(this.rear == null) {
      this.front = newNode;
      this.rear = newNode;
    } else {
      this.rear.next = newNode;
      this.rear = newNode;
    }
  }

  public Animal dequeue(String pref){
    if(pref.equals("dog")){
      Node<T> temp;
    } else if(pref.equals("cat")){
      while(this.front.value != Cat){

      }
    } else {
      return null;
    }
  }

}
