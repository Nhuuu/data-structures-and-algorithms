package graph;


import stacksandqueues.Stack;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;

public class Graph<T> {

  private HashSet<Node<T>> vertices;

  public Graph(){
    this.vertices = new HashSet<>();
  }

  public Node<T> addNode(Node node){
    this.vertices.add(node);
    return node;
  }

  public void addEdge(Node<T> node1, Node<T> node2){
    if(this.vertices.contains(node1) && this.vertices.contains(node2)){
      node1.addNeighbor(node2);
      node2.addNeighbor(node1);
    }
  }

  public void addEdge(Node<T> node1, Node<T> node2, int weight){
    if(this.vertices.contains(node1) && this.vertices.contains(node2)){
      node1.addNeighbor(node2, weight);
      node2.addNeighbor(node1, weight);
    }
  }

  public HashSet<Node<T>> getNodes() {
    return this.vertices;
  }

  public HashSet<Edge> getNeighbors(Node<T> node){
    return node.neighbors;
  }

  public int getSize(){
    return this.vertices.size();
  }

  public LinkedList<Node> breadthFirst(Node start){
    if(start == null){
      throw new NullPointerException("Graph is empty.");
    }
    LinkedList result = new LinkedList<>();
    Queue<Node> breadth = new Queue<>();
    HashSet<Node> visited = new HashSet<>();

    breadth.enqueue(start);
    visited.add(start);

    while(!breadth.isEmpty()){
      Node front = breadth.dequeue();
      result.add(front);
      for(Edge neighbor : (HashSet<Edge>) front.neighbors){
        if(!visited.contains(neighbor.getNode())){
          breadth.enqueue(neighbor.getNode());
          visited.add(neighbor.getNode());
        }
      }
    }
    return result;
  }

  public static HashMap<Boolean, Integer> getEdge(Graph routes, String[] cityNames) {
    HashMap<Boolean, Integer> result = new HashMap<>();
    int cost = 0;
    boolean b = false;
    Node current;
//    if(routes.vertices.contains(cityNames[0])){
      for(Object n : routes.vertices){
        if(cityNames[0].equals(n)){
          current = (Node) n;
        }
      }
//    }
    System.out.println(routes.vertices);
//    System.out.println(current.value);

//    for (Edge neighbor : (HashSet<Edge>) current.neighbors) {
//      for (int i = 1; i < cityNames.length; i++) {
//        if (neighbor.getNode().value == cityNames[i]) {
//          b = true;
//          cost = cost + neighbor.getWeight();
//          current = neighbor.getNode();
//        }
//      }
//    }
    result.put(b, cost);
    return result;
  }


  public static LinkedList<Node> depthFirst(Node start){
    LinkedList result = new LinkedList();
    HashSet<Node> visited = new HashSet<>();

    Stack stack  = new Stack();
    stack.push(start);
    visited.add(start);

    while(!stack.isEmpty()){
      Node tempNode = (Node) stack.pop();
      result.add(tempNode);

      for(Edge neighbor: (HashSet<Edge>) tempNode.neighbors){
        if(!visited.contains(neighbor.getNode())){
          stack.push(neighbor.getNode());
          visited.add(neighbor.getNode());
        }
      }
    }
    return result;
  }

}
