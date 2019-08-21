package utilities;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class AnimalShelterTest {

  AnimalShelter animalShelter;
  @Before
  public void setUp(){
    animalShelter = new AnimalShelter();
  }
  @Test
  public void enqueue() {
    Dog abby = new Dog("Abby", "Belgian Malinois", 9);
    animalShelter.enqueue(abby);
    assertEquals("Should add Abby to the queue", abby, animalShelter.dogQueue.peek());
  }

  @Test
  public void dequeueDog() {
    Dog abby = new Dog("Abby", "Belgian Malinois", 9);
    animalShelter.enqueue(abby);
    assertEquals("Should dequeue the preferred animal", abby, animalShelter.dequeue(Dog.class));
  }

  @Test
  public void dequeueDogMultiple() {
    Dog abby = new Dog("Abby", "Belgian Malinois", 9);
    Dog ginger = new Dog("Ginger", "Fluff", 2);
    animalShelter.enqueue(abby);
    animalShelter.enqueue(ginger);
    animalShelter.dequeue(Dog.class);
    assertEquals("Should dequeue the preferred animal", ginger, animalShelter.dequeue(Dog.class));
  }

  @Test
  public void dequeueCat() {
    Cat peaches = new Cat("Peaches", "Tabby", 10);
    Cat tilly = new Cat("Tilly", "Tabby", 10);
    animalShelter.enqueue(peaches);
    animalShelter.enqueue(tilly);
    assertEquals("Should dequeue the preferred animal", peaches, animalShelter.dequeue(Cat.class));
  }

  @Test
  public void dequeueCatMultiple() {
    Cat peaches = new Cat("Peaches", "Tabby", 10);
    Cat tilly = new Cat("Tilly", "Tabby", 10);
    animalShelter.enqueue(peaches);
    animalShelter.enqueue(tilly);
    animalShelter.dequeue(Cat.class);
    assertEquals("Should dequeue the preferred animal", tilly, animalShelter.dequeue(Cat.class));
  }
}