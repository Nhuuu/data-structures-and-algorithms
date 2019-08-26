# Multi Bracket Validation

## Features
Your function should take a string as its only argument, and should return a boolean representing whether or not the brackets in the string are balanced. There are 3 types of brackets:

Round Brackets : ()
Square Brackets : []
Curly Brackets : {}

## Approach & Efficiency
Used a stack to hold opening brackets and popped them off the stack when the corresponding closing bracket was found. If the closing brakcet did not match the top node in the stack, then the method would return false. If the stack is not empty in the end after iterating through the entire string input, it would also return false. This operates with a time and space complexity of O(n).

## API
* validate()

* [Multi Bracket Validation Code](../Data-Structures/src/main/java/utilities)
* [Multi Bracket Validation  Tests](../Data-Structures/src/test/java/utilities)

* ![Multi Bracket Validation whiteboarding](../assets/multibracketvalidation.jpg)