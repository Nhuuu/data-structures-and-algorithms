package graph;


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
}
