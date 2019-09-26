package graph;

import org.junit.Before;
import org.junit.Test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

import static org.junit.Assert.*;

public class GraphTest {

  Graph g;
  Graph routes;
  @Before
  public void setUp(){
    g = new Graph();
    g.addNode(new Node("hi"));

    routes = new Graph();

    Node pandora = new Node("pandora");
    Node narnia = new Node("narnia");
    Node metroville = new Node("metroville");
    Node arendelle = new Node("arendelle");
    Node naboo = new Node("naboo");
    Node monstropolis = new Node("monstropolis");

    routes.addNode(pandora);
    routes.addNode(narnia);
    routes.addNode(metroville);
    routes.addNode(arendelle);
    routes.addNode(naboo);
    routes.addNode(monstropolis);

    routes.addEdge(pandora, metroville, 82);
    routes.addEdge(pandora, arendelle, 150);
    routes.addEdge(metroville, narnia, 37);
    routes.addEdge(metroville, naboo, 26);
    routes.addEdge(metroville, monstropolis, 105);
    routes.addEdge(metroville, arendelle, 99);
    routes.addEdge(narnia, naboo, 250);
    routes.addEdge(naboo, monstropolis, 73);
    routes.addEdge(monstropolis, arendelle, 42);

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

  @Test
  public void getEdgeTest_route_does_not_exist(){
    HashMap expected = new HashMap();
    expected.put(false, 0);
    String[] names = new String[]{"naboo", "pandora"};
    assertEquals(expected, Graph.getEdge(routes, names));
  }

  @Test
  public void getEdgeTest_route_does_not_exist_2(){
    HashMap expected = new HashMap();
    expected.put(false, 0);
    String[] names = new String[]{"narnia", "arendelle", "naboo"};
    assertEquals(expected, Graph.getEdge(routes, names));
  }

  @Test
  public void getEdgeTest_direct_route_exists(){
    HashMap expected = new HashMap();
    expected.put(true, 82);
    String[] names = new String[]{"metroville", "pandora"};
    assertEquals(expected, Graph.getEdge(routes, names));
  }

  @Test
  public void getEdgeTest_direct_route_exists_2(){
    HashMap expected = new HashMap();
    expected.put(true, 115);
    String[] names = new String[]{"arendelle", "monstropolis", "naboo"};
    assertEquals(expected, Graph.getEdge(routes, names));
  }

  @Test
  public void depthFirstTest(){
    Graph gr = new Graph();
    Node yo = new Node("yo");
    Node hello = new Node("hello");
    Node hey = new Node("hey");
    gr.addNode(yo);
    gr.addNode(hello);
    gr.addNode(hey);

    yo.addNeighbor(hello);
    yo.addNeighbor(hey);

    LinkedList<Node> expected = new LinkedList<>();
    expected.add(yo);
    expected.add(hello);
    expected.add(hey);

    assertEquals(expected, gr.depthFirst(yo));
  }


}