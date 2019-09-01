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

  public ArrayList<T> breadthFirst(Node<T> root){
    ArrayList<T> ans = new ArrayList<>();
    Queue<Node> q = new Queue();
    q.enqueue(root);
    while(!q.isEmpty()){
      Node current = q.dequeue();
      ans.add((T)current.value);
      if(current.left != null){
        q.enqueue(current.left);
      }
      if(current.right != null){
        q.enqueue(current.right);
      }
    }
    return ans;
  }

  public int findMaxValue(Node root) {
    int max = -1;
    if (root == null) return max;
    max = (int) root.value;
    max = findMaxValue(root.left) > max ? findMaxValue(root.left) : max;
    max = findMaxValue(root.right) > max ? findMaxValue(root.right) : max;
    return max;
  }

  public String toString() {
    return this.root.toString();
  }

}
