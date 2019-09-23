package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashSet;

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
}