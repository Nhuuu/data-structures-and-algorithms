package tree;

import stacksandqueues.Queue;
import java.util.ArrayList;

public class BinaryTree<T> {
  Node<T> root;

  public BinaryTree(){
    this.root = null;
  }

  public BinaryTree(Node<T> root){
    this.root = root;
  }

  // root, left, right
  public ArrayList<T> preOrder(Node<T> current){
    if(current == null){
      return new ArrayList<T>();
    } else {
      ArrayList<T> left = inOrder(current.left);
      ArrayList<T> right = inOrder(current.right);

      ArrayList<T> result = new ArrayList<>();
      result.add(current.value);
      result.addAll(left);
      result.addAll(right);
      return result;
    }
  }

  // left, root, right
  public ArrayList<T> inOrder(Node<T> current){
    if(current == null){
      return new ArrayList<T>();
    } else {
      ArrayList<T> left = inOrder(current.left);
      ArrayList<T> right = inOrder(current.right);

      ArrayList<T> result = new ArrayList<>();
      result.addAll(left);
      result.add(current.value);
      result.addAll(right);
      return result;
    }
  }

  // left, right, root
  public ArrayList<T> postOrder(Node<T> current){
    if(current == null){
      return new ArrayList<T>();
    } else {
      ArrayList<T> left = inOrder(current.left);
      ArrayList<T> right = inOrder(current.right);

      ArrayList<T> result = new ArrayList<>();
      result.addAll(left);
      result.addAll(right);
      result.add(current.value);
      return result;
    }
  }

  public ArrayList<T> breadthFirst(){
    ArrayList<T> ans = new ArrayList<>();
    Queue<T> q = new Queue();
    Node<T> current = this.root;
    while(current != null){
      q.enqueue(current.value);
      if(current.left != null){
        q.enqueue(current.left.value);
      }
      if(current.right != null){
        q.enqueue(current.right.value);
      }
      ans.add(q.dequeue());
    }
    return ans;
  }


}
