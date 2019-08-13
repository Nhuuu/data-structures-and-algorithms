/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package linkedlist;


import org.junit.*;
import static org.junit.Assert.*;


public class LinkedListTest {

    LinkedList list;
    @Before
    public void setUp() throws Exception {
        list = new LinkedList();
    }

    @Test public void testInsert() {
        list.insert("Something");
        assertTrue(list.head.value == "Something");
    }

    @Test public void testIncludes_true(){
        list.insert("Something");
        assertTrue("Should return boolean true when linked list has the value", list.includes("Something"));
    }

    @Test public void testIncludes_false(){
        assertFalse("Should return boolean false when linked list does not have the value.", list.includes(
            "Something"));
    }

    @Test public void testToString(){
        list.insert("a");
        list.insert("b");
        assertEquals("Returns a string of all values in the linked list.", "HEAD -> b -> a -> null", list.toString());
    }

    @Test public void testAppend(){
        list.append("Something");
        list.append("Another Thing");
        assertEquals("Test for append should add to the end of the linked list and then end with null", "HEAD -> " +
            "Something -> Another Thing -> null", list.toString());
    }

    @Test public void testInsertBefore(){
        list.append(1);
        list.append(3);
        list.append(2);
        list.insertBefore(5,3);
        assertEquals("Test should add a value before the target", "1 -> 5 -> 3 -> 2 -> null", list.toString());
    }

    @Test public void testInsertAfter(){
        list.append(1);
        list.append(3);
        list.append(2);
        list.insertAfter(5, 3);
        assertEquals("Test should add value after the target", "1 -> 3 -> 5 -> 2 -> null", list.toString());
    }
}
