package tree;


public class BinarySearchTree<T> extends BinaryTree {
  public BinarySearchTree(){
    super();
  };

  // TODO:
  public void add(T value) {
    if (this.root == null) {
      this.root = new Node<>(value);
    } else {
      Node<T> current = this.root;
      while (current != null) {
        if ((int)value < (int)current.value) {
          if (current.left == null) {
            current.left = new Node(value, current, null);
            return;
          } else {
            current = current.left;
          }
        } else {
          if (current.right == null) {
            current.right = new Node(value);
          } else {
            current = current.right;
          }
        }
      }
    }
  }

  // TODO:
//   Whether or not the value is in the tree at least once.
//  public boolean contains(int value){
//
//  }

}
