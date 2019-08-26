package tree;

import java.util.ArrayList;

public class BinaryTree {
  Node root;
  ArrayList<Integer> br = new ArrayList<>();

  public BinaryTree(){
    this.root = null;
  }

  // breadth traversal to add
//  public int add(int value){
//    Node current = this.root;
//    Node left; Node right;
//    if(this.root == null){
//      this.root = new Node(value);
//    } else {
//      left = current.left;
//      right = current.right;
//      while(current != null){
//        if(left == null) {
//          left = new Node(value);
//          current = left;
//        } else if(right == null){
//          right = new Node(value);
//          current = right;
//        } else {
//          current = current.left;
//        }
//      }
//    }
//    return current.getValue();
//  }

  // left, right, root
  public ArrayList<Integer> preOrder(Node root){
    br.add(root.value);
    if(root.left != null){
      preOrder(root.left);
    }
    if (root.right != null){
      preOrder(root.right);
    }
    return br;
  }

  // left, root, right
  public ArrayList<Integer> inOrder(Node root){
    if(root.left != null){
      inOrder(root.left);
    }
    br.add(root.value);
    if(root.right != null){
      inOrder(root.right);
    }
    return br;
  }

  // left, right, root
  public ArrayList<Integer> postOrder(Node root){
    if(root.left != null){
      postOrder(root.left);
    }
    if(root.right != null){
      postOrder(root.right);
    }
    br.add(root.value);
    return br;
  }

}
