# FIFO Animal Shelter

## Challenge
Create a class called AnimalShelter which holds only dogs and cats. The shelter operates using a first-in, first-out approach.
Implement the following methods:
enqueue(animal): adds animal to the shelter. animal can be either a dog or a cat object.
dequeue(pref): returns either a dog or a cat. If pref is not "dog" or "cat" then return null.

## Approach & Efficiency
<!-- My approach was two use the first stack for the enqueue method to add new nodes to. Then when it was time to dequeue, the nodes from the first stack would get popped off and pushed into the new stack. Creating a FIFO flow upon dequeue. My method for adding a node to the queue(enqueue) has a Big O time/space complexity of O(1), however my dequeue method has a time of O(n) and space of O(1). -->

## API
* enqueue()
* dequeue()

* [FIFO Animal Shelter](../Data-Structures/src/main/java/utilities)
* [FIFO Animal Shelter Tests](../Data-Structures/src/test/java/utilities)

* ![FIFO Animal Shelter whiteboarding](../assets/animalshelter.jpg)
