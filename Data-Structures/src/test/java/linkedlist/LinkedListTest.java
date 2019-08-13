/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;


import org.junit.*;
import static org.junit.Assert.*;


public class LinkedListTest {
    @Test public void testInsert() {
        LinkedList list = new LinkedList();
        list.insert("Something");
        assertTrue(list.head.value == "Something");
    }

    @Test public void testIncludes_true(){
        LinkedList list = new LinkedList();
        list.insert("Something");
        assertTrue("Should return boolean true when linked list has the value", list.includes("Something"));
    }

    @Test public void testIncludes_false(){
        LinkedList list = new LinkedList();
        assertFalse("Should return boolean false when linked list does not have the value.", list.includes(
            "Something"));
    }

    @Test public void testToString(){
        LinkedList list = new LinkedList();
        list.insert("a");
        list.insert("b");
        assertEquals("Returns a string of all values in the linked list.", "HEAD -> a -> b -> null", list.toString());
    }
}
