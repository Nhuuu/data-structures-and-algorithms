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
    Cat peaches = new Cat("Peaches", "Tabby", 10);
    Cat tilly = new Cat("Tilly", "Tabby", 10);
    animalShelter.enqueue(abby);
    assertEquals("Should add Abby to the queue", abby, animalShelter.front.getValue());
  }

  @Test
  public void dequeue() {
    Dog abby = new Dog("Abby", "Belgian Malinois", 9);
    Cat peaches = new Cat("Peaches", "Tabby", 10);
    Cat tilly = new Cat("Tilly", "Tabby", 10);
    animalShelter.enqueue(abby);
    animalShelter.enqueue(peaches);
    animalShelter.enqueue(tilly);
  }
}