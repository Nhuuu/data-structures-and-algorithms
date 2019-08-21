package utilities;

import stacksandqueues.Queue;

public class AnimalShelter<T> {
  Queue<Dog> dogQueue;
  Queue<Cat> catQueue;

  public AnimalShelter(){
    this.dogQueue = new Queue<>();
    this.catQueue = new Queue<>();
  }

  public void enqueue(Animal animal){
    if(animal.getClass() == Dog.class){
      dogQueue.enqueue((Dog) animal);
    } else {
      catQueue.enqueue((Cat) animal);
    }
  }

  public <x> x dequeue(Class<x> pref){
    if(pref.equals(Dog.class)){
      return pref.cast(dogQueue.dequeue());
    } else if(pref.equals(Cat.class)){
      return pref.cast(catQueue.dequeue());
    } else {
      return null;
    }
  }

}
