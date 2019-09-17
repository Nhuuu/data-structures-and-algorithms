package hashtable;

import tree.BinaryTree;

import java.util.HashSet;

public class TreeIntersection {

  public static HashSet treeIntersection(BinaryTree tree, BinaryTree tree2){
    HashSet intersection = new HashSet();
    HashSet t = addTree(tree);
    HashSet t2 = addTree(tree2);
    for(Object o : t){
      if(t2.contains(o)){
        intersection.add(o);
      }
    }
    return intersection;
  }

  private static HashSet addTree(BinaryTree bt){
    HashSet h = new HashSet();
    for(Object obj : bt.preOrder(bt.root)){
      h.add(obj);
    }
    return h;
  }
}
