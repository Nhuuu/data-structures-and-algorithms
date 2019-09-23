package graph;

import java.util.HashSet;

public class Node<T> {
  public T value;
  public Node<T> next;
  public HashSet<Edge> neighbors;

  public Node(T value){
    this.value = value;
    this.neighbors = new HashSet<>();
  }

  public void addNeighbor(Node<T> node){
    Edge e = new Edge(node);
    this.neighbors.add(e);
  }

  public void addNeighbor(Node<T> node, int weight){
    Edge e = new Edge(node, weight);
    this.neighbors.add(e);
  }

  public T getValue() {
    return value;
  }

  public String toString(){
    return this.value.toString();
  }
}
