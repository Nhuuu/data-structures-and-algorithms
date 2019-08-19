# Stacks and Queues
Implement a Stack and a Queue Data Structure

## Features
* Create a Node class that has properties for the value stored in the Node, and a pointer to the next node.
* Create a Stack class that has a top property. It creates an empty Stack when instantiated.
  * This object should be aware of a default empty value assigned to top when the stack is created.
  * Define a method called push which takes any value as an argument and adds a new node with that value to the top of the stack with an O(1) Time performance.
  * Define a method called pop that does not take any argument, removes the node from the top of the stack, and returns the node’s value.
  * Define a method called peek that does not take an argument and returns the value of the node located on top of the stack, without removing it from the stack.
* Create a Queue class that has a front property. It creates an empty Queue when instantiated.
  * This object should be aware of a default empty value assigned to front when the queue is created.
  * Define a method called enqueue which takes any value as an argument and adds a new node with that value to the back of the queue with an O(1) Time performance.
  * Define a method called dequeue that does not take any argument, removes the node from the front of the queue, and returns the node’s value.
  * Define a method called peek that does not take an argument and returns the value of the node located in the front of the queue, without removing it from the queue.

## Approach & Efficiency
These methods are all Big O(1) for space and time because we are just adding one node at a time or removing one node at a time. Approach was to reassign properties to the nodes so that it makes sense. (For stacks, reassigning the top node property. For queues, reassigning the front and rear node properties.)

## API
Stack.java: push(), pop(), peek()
Queue.java: enqueue(), dequeue(), peek()

* [Stacks and Queues Code](../Data-Structures/src/main/java/stacksandqueues)
* [Stacks and Queues Tests](../Data-Structures/src/test/java/stacksandqueues)
