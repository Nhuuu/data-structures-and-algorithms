# FIFO Animal Shelter

## Challenge
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
Implement the following methods:
enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

## Approach & Efficiency
My approach was to use to create a superclass of animals that the dog and cat classes would extend to. Then create an animalshelter class that would hold all of the animals in a queue. The enqueue method would add new nodes with values of an animal. Then when it was time to dequeue, the method would go through starting from the front to check if the preferred animal matches and dequeue that animal. My method for adding a node to the queue(enqueue) has a Big O time/space complexity of O(1), however my dequeue method has a time of O(n) and space of O(1).

## API
* enqueue()
* dequeue()

* [FIFO Animal Shelter](../Data-Structures/src/main/java/utilities)
* [FIFO Animal Shelter Tests](../Data-Structures/src/test/java/utilities)

* ![FIFO Animal Shelter whiteboarding](../assets/animalshelter.jpg)
