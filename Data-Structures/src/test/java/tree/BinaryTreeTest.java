package tree;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.Assert.*;

public class BinaryTreeTest {

  BinaryTree tree;
  BinarySearchTree searchTree;
  @Before
  public void setUp(){
    tree = new BinaryTree();
    searchTree = new BinarySearchTree();
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
    tree.root = new Node(5);
    assertTrue(tree.root.getValue() == 5);
  }

  @Test
  public void testAddLeftAndRightChildNodes(){
    tree.root = new Node(5);
    tree.root.left = new Node(4);
    tree.root.right = new Node(6);
    assertTrue(tree.root.left.getValue() == 4);
    assertTrue(tree.root.right.getValue() == 6);
  }

  @Test
  public void testPreOrderTraversal(){
    Node root = new Node(6);
    root.left = new Node(4);
    root.right = new Node(10);
    Node node4 = root.left;
    Node node10 = root.right;
    node4.left = new Node(1);
    node4.right = new Node(5);
    node10.left = new Node(7);
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(6,4,1,5,10,7));
    ArrayList result = tree.preOrder(root);
    assertEquals(test, result);
  }

  @Test
  public void testInOrderTraversal(){
    Node root = new Node(6);
    root.left = new Node(4);
    root.right = new Node(10);
    Node node4 = root.left;
    Node node10 = root.right;
    node4.left = new Node(1);
    node4.right = new Node(5);
    node10.left = new Node(7);
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,4,5,6,7,10));
    assertEquals(test, tree.inOrder(root));
  }

  @Test
  public void testPostOrderTraversal(){
    Node root = new Node(6);
    root.left = new Node(4);
    root.right = new Node(10);
    Node node4 = root.left;
    Node node10 = root.right;
    node4.left = new Node(1);
    node4.right = new Node(5);
    node10.left = new Node(7);
    ArrayList<Integer> test = new ArrayList<>(Arrays.asList(1,5,4,7,10,6));
    assertEquals(test, tree.postOrder(root));
  }

  @Test
  public void testBinarySearchTree_addRoot(){
    searchTree.add(1);
    assertTrue((int)searchTree.root.value == 1);
  }

  @Test
  public void testBinarySearchTree_addMultiple(){
    searchTree.add(6);
    searchTree.add(4);
    searchTree.add(7);
    assertTrue((int)searchTree.root.value == 6);
    assertTrue((int)searchTree.root.left.value == 4);
    assertTrue((int)searchTree.root.right.value == 7);
  }

  @Test
  public void testBinarySearchTree_contains(){
    searchTree.root = new Node(6);
    searchTree.add(4);
    searchTree.add(7);
    searchTree.add(12);
    assertTrue(searchTree.contains(searchTree.root, 12));
  }

  @Test
  public void testBinarySearchTree_doesNotContain(){
    searchTree.root = new Node(6);
    searchTree.add(4);
    searchTree.add(7);
    assertFalse(searchTree.contains(searchTree.root, 12));
  }




}