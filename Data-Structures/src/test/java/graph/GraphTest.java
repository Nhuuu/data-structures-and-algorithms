package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class GraphTest {

  Graph g;
  @Before
  public void setUp(){
    g = new Graph();
    g.addNode(new Node("hi"));
  }

  @Test
  public void addNode() {
    HashSet expected = new HashSet();
    expected.add("hi");
    assertEquals(expected.toString(), g.getNodes().toString());
  }

  @Test
  public void addEdge() {
    Node firstNode = new Node("hi");
    Node secondNode = new Node("bye");
    Node thirdNode = new Node("hi again");
    g.addNode(firstNode);
    g.addNode(secondNode);
    g.addNode(thirdNode);
    g.addEdge(firstNode, secondNode);
    g.addEdge(firstNode, thirdNode);
    assertEquals(2, firstNode.neighbors.size());
    assertEquals(1, secondNode.neighbors.size());
  }

  @Test
  public void getSize() {
    assertEquals(1, g.getSize());
  }

  @Test
  public void breadthFirst() {
    LinkedList expected = new LinkedList();
    expected.add(1);
    expected.add(2);
    expected.add(3);
    expected.add(4);
    expected.add(5);
    expected.add(6);

    //       1
    //     /   \
    //    2    3
    //   /  \ /
    //  4   5 6
    Node node1 = new Node<>(1);
    Node node2 = new Node<>(2);
    Node node3 = new Node<>(3);
    Node node4 = new Node<>(4);
    Node node5 = new Node<>(5);
    Node node6 = new Node<>(6);

    Graph nums = new Graph();
    nums.addNode(node1);
    nums.addNode(node2);
    nums.addNode(node3);
    nums.addNode(node4);
    nums.addNode(node5);
    nums.addNode(node6);

    nums.addEdge(node1, node2);
    nums.addEdge(node1, node3);
    nums.addEdge(node2, node4);
    nums.addEdge(node2, node5);
    nums.addEdge(node3, node6);

    assertEquals(expected, nums.breadthFirst(node1));
  }
}