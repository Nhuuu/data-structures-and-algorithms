package hashtable;

import org.junit.Before;
import org.junit.Test;
import tree.BinaryTree;
import tree.Node;

import java.util.HashSet;

import static org.junit.Assert.*;

public class TreeIntersectionTest {

  BinaryTree t;
  BinaryTree t2;
  BinaryTree noMatch;
  @Before
  public void setUp(){
    //       1
    //     /   \
    //    2    3
    //   /  \ /
    //  4   5 6
    tree.Node nodes1 = new tree.Node<>(1,
        new tree.Node<>(2,
            new tree.Node<>(4),
            new tree.Node<>(5)),
        new tree.Node<>(3,
            new Node<>(6), null));
    t = new BinaryTree(nodes1);

    //       2
    //     /   \
    //    4    6
    //   /  \ /
    //  7   8 7
    tree.Node nodes2 = new tree.Node<>(2,
        new tree.Node<>(4,
            new tree.Node<>(7),
            new tree.Node<>(8)),
        new tree.Node<>(6,
            new Node<>(7), null));
    t2 = new BinaryTree(nodes2);

    tree.Node nodes3 = new tree.Node<>(10,
        new tree.Node<>(11,
            new tree.Node<>(12),
            new tree.Node<>(13)),
        new tree.Node<>(14,
            new Node<>(15), null));
    noMatch = new BinaryTree(nodes3);
  }

  @Test
  public void treeIntersection() {
    HashSet expected = new HashSet(){};
    expected.add(2);
    expected.add(4);
    expected.add(6);
    assertEquals(expected, TreeIntersection.treeIntersection(t, t2));
  }

  @Test
  public void treeIntersection_none() {
    HashSet expected = new HashSet();
    assertEquals(expected, TreeIntersection.treeIntersection(t, noMatch));
  }
}