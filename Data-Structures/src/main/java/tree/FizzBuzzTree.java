package tree;

public class FizzBuzzTree {

  public static BinaryTree<Object> fizzBuzzTree(BinaryTree<Object> inputTree) {
    fizzBuzz(inputTree.root);
    return inputTree;
  }

  private static void fizzBuzz(Node<Object> current){
    if (current != null) {
      if ((int)current.value % 15 == 0) {
        current.value = "FizzBuzz";
      } else if ((int)current.value % 5 == 0) {
        current.value = "Buzz";
      } else if ((int)current.value % 3 == 0) {
        current.value = "Fizz";
      }
      fizzBuzz(current.left);
      fizzBuzz(current.right);
    }
  }
}
