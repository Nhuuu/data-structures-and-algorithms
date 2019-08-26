# Binary search tree

## Challenge
* Create a Node class that has properties for the value stored in the node, the left child node, and the right child node.
* Create a BinaryTree class
* Define a method for each of the depth first traversals called preOrder, inOrder, and postOrder which returns an array of the values, ordered appropriately.

* Create a BinarySearchTree class
* Define a method named add that accepts a value, and adds a new node with that value in the correct location in the binary search tree.
* Define a method named contains that accepts a value, and returns a boolean indicating whether or not the value is in the tree at least once.

## Approach & Efficiency
<!-- Used a stack to hold opening brackets and popped them off the stack when the corresponding closing bracket was found. If the closing brakcet did not match the top node in the stack, then the method would return false. If the stack is not empty in the end after iterating through the entire string input, it would also return false. This operates with a time and space complexity of O(n). -->

## API
* preOrder()
* inOrder()
* postOrder()
* add()
* contains()


* [Binary Search Tree Code](../Data-Structures/src/main/java/tree)
* [Binary Search Tree Tests](../Data-Structures/src/test/java/tree)

* ![Binary Search Tree whiteboarding](../assets/binarysearchtree.jpg)