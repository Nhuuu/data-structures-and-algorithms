package graph;


import java.util.HashSet;

public class Graph<T> {

  private HashSet<Node<T>> vertices;

  public Graph(){
    this.vertices = new HashSet<>();
  }

  public Node<T> addNode(Node node){
    this.vertices.add(node);
    return node;
  }

  public void addEdge(Node<T> node, Node<T> node2){
    if(this.vertices.contains(node) && this.vertices.contains(node2)){
      node.addNeighbor(node2);
      node2.addNeighbor(node);
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

}
