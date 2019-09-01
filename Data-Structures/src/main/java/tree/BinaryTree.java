package tree;

import java.util.ArrayList;

public class BinaryTree {
  Node root;
  ArrayList<Integer> br = new ArrayList<>();

  public BinaryTree(){
    this.root = null;
  }

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

  public String toString() {
    return this.root.toString();
  }

}
