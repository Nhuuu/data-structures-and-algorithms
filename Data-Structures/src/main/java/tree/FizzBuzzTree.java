package tree;

public class FizzBuzzTree {

  public static BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> inputTree) {
    Node current = inputTree.root;
    if (current != null) {
      if ((int)current.value % 15 == 0) {
        current.value = "FizzBuzz";
      } else if ((int)current.value % 5 == 0) {
        current.value = "Buzz";
      } else if ((int)current.value % 3 == 0) {
        current.value = "Fizz";
      }
      fizzBuzzTree(current.left);
      fizzBuzzTree(current.right);
    }
    return inputTree;
  }
}
