package graph;

public class Edge<T> {
  private int weight;
  private Node<T> node;

  public Edge(Node<T> node){
    this.node = node;
  }

  public Edge(Node<T> node, int weight){
    this.node = node;
    this.weight = weight;
  }

  public Node<T> getNode() {
    return this.node;
  }
}
