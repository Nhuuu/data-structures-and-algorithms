package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest {

  BinaryTree tree;
  BinaryTree tree2;
  BinarySearchTree searchTree;
  BinaryTree f;
  @Before
  public void setUp(){
    tree = new BinaryTree();

    Node nodes = new Node<>(6,
        new Node<>(4,
            new Node<>(1),
            new Node<>(5)),
        new Node<>(10,
            new Node<>(7), null));
    tree2 = new BinaryTree(nodes);

    searchTree = new BinarySearchTree();

    Node<Object> nodes2 = new Node<>(3,
        new Node<>(20,
            new Node<>(1),
            new Node<>(5)),
        new Node<>(15,
            new Node<>(7), null));
    BinaryTree t = new BinaryTree(nodes);
    f = new BinaryTree(nodes2);
  }

  @Test
  public void testEmptyBinaryTree(){
    assertTrue(tree.root == null);
  }

  @Test
  public void testEmptyBinarySearchTree(){
    assertTrue(searchTree.root == null);
  }

  @Test
  public void testBinaryTreeRootNode(){
    assertTrue((int)tree2.root.getValue() == 6);
  }

  @Test
  public void testAddLeftAndRightChildNodes(){
    assertTrue((int)tree2.root.left.getValue() == 4);
    assertTrue((int)tree2.root.right.getValue() == 10);
  }

  @Test
  public void testPreOrderTraversal(){
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(6,1,4,5,7,10));
    ArrayList result = tree2.preOrder(tree2.root);
    assertEquals(test, result);
  }

  @Test
  public void testInOrderTraversal(){
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,4,5,6,7,10));
    assertEquals(test, tree2.inOrder(tree2.root));
  }

  @Test
  public void testPostOrderTraversal(){
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,4,5,7,10,6));
    assertEquals(test, tree2.postOrder(tree2.root));
  }

  @Test
  public void testBinarySearchTree_addRoot(){
    searchTree.add(1);
    assertTrue((int)searchTree.root.value == 1);
  }

  @Test
  public void testFizzBuzz(){
    BinaryTree t = FizzBuzzTree.fizzBuzzTree(f); // (3,1,20,5,7,15)
    ArrayList<Object> test = new ArrayList<>(Arrays.asList("fizz",4,"buzz","buzz",7,"fizzbuzz"));
    assertEquals(test, t.inOrder(t.root));
  }

}