# FizzBuzz tree

## Challenge
* Write a function called FizzBuzzTree which takes a tree as an argument.
* Without utilizing any of the built-in methods available to your language, determine weather or not the value of each node is divisible by 3, 5 or both, and change the value of each of the nodes:
* If the value is divisible by 3, replace the value with “Fizz”
* If the value is divisible by 5, replace the value with “Buzz”
* If the value is divisible by 3 and 5, replace the value with “FizzBuzz”
* Return the tree with its new values.

## Approach & Efficiency
<!-- Used a stack to hold opening brackets and popped them off the stack when the corresponding closing bracket was found. If the closing brakcet did not match the top node in the stack, then the method would return false. If the stack is not empty in the end after iterating through the entire string input, it would also return false. This operates with a time and space complexity of O(n). -->

## API
* fizzBuzzTree()


* [FizzBuzz Tree Code](../Data-Structures/src/main/java/tree)
* [FizzBuzz Tree Tests](../Data-Structures/src/test/java/tree)

* ![FizzBuzz Tree whiteboarding](../assets/fizzbuzz.jpg)