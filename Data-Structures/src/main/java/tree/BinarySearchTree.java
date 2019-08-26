package tree;

import java.util.ArrayList;

public class BinarySearchTree {
  Node root;
  ArrayList<Integer> br = new ArrayList<>();

  public BinarySearchTree(){
    this.root = null;
  };

  public void add(int value){
    Node current = this.root;
    if(current == null){
      this.root = new Node(value);
    } else if(value < current.value){
      while(current.left != null){
        current = current.left;
      }
      current.left = new Node(value, current, null);
    } else if(value > current.value){
      while(current.right != null){
        current = current.right;
      }
      current.right = new Node(value, current, null);
    }
  }

  // Whether or not the value is in the tree at least once.
//  public boolean contains(int value){
//
//  }

}
