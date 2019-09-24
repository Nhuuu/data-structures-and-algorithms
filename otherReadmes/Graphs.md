# Graphs
Implement a graph. The graph should be represented as an adjacency list.

## Graph.java, API
* addNode()
  * Adds a new node to the graph
  * Takes in the value of that node
  * Returns the added node

* addEdge()
  * Adds a new edge between two nodes in the graph
  * Include the ability to have a “weight”
  * Takes in the two nodes to be connected by the edge
  * Both nodes should already be in the Graph

* getNodes()
  * Returns all of the nodes in the graph as a collection (set, list, or similar)

* getNeighbors()
  * Returns a collection of nodes connected to the given node
  * Takes in a given node
  * Include the weight of the connection in the returned collection

* size()
  * Returns the total number of nodes in the graph

* breadthFirst()
  * traverses a graph using a Queue

* getEdge()
  * Given a business trip itinerary, and an Alaska Airlines route map, is the trip possible with direct flights? If so, how much will the total trip cost be?
  * White a function which takes in a graph, and an array of city names. Return whether the full trip is possible with direct flights, and how much it would cost.

* [Graph](../Data-Structures/src/main/java/graph)
* [Graph Tests](../Data-Structures/src/test/java/graph)

