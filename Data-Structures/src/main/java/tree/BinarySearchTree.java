package tree;

import java.util.ArrayList;

public class BinarySearchTree {
  Node root;
  ArrayList<Integer> br = new ArrayList<>();

  public BinarySearchTree(){
    this.root = null;
  };

  public void add(int value) {
    if (this.root == null) {
      this.root = new Node<>(value);
    } else {
      Node current = this.root;
      while (current != null) {
        if (value < current.value) {
          if (current.left == null) {
            current.left = new Node(value);
            return;
          } else {
            current = current.left;
          }
        } else {
          if (current.right == null) {
            current.right = new Node(value);
            return;
          } else {
            current = current.right;
          }
        }
      }
    }
  }

  public boolean contains(Node<Integer> root, int value){
    if (root == null){
      return false;
    }
    if(root.value == value){
      return true;
    }
    if(root.value >= value){
      return contains(root.left, value);
    }
    return contains(root.right, value);
  }

}
