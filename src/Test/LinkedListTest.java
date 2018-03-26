package Test;

import Collection.LinkedList;
import Collection.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by BelSi1731422 on 2018-03-26.
 */
class LinkedListTest {
    List linkedList;
    @BeforeEach
    void setUp() {
        linkedList = new LinkedList();
        linkedList.add("var0");
        linkedList.add("var1");
        linkedList.add("var2");
    }

    @Test
    void add() {
        linkedList.add(3,"var3");
        linkedList.add(1,"var4");
        assertEquals("var0",linkedList.get(0));
        assertEquals("var4",linkedList.get(1));
        assertEquals("var1",linkedList.get(2));
        assertEquals("var2",linkedList.get(3));
        assertEquals("var3",linkedList.get(4));
    }

    @Test
    void remove() {
        linkedList.remove(0);
        linkedList.remove(1);
        assertEquals("var1",linkedList.get(0));
        assertEquals(null,linkedList.get(1));
        assertEquals(null,linkedList.get(2));
    }

    @Test
    void get() {
        assertEquals("var0",linkedList.get(0));
        assertEquals("var1",linkedList.get(1));
        assertEquals("var2",linkedList.get(2));
        assertEquals(null,linkedList.get(3));
    }

    @Test
    void set() {
        linkedList.set(1,"var3");
        assertEquals("var0",linkedList.get(0));
        assertEquals("var3",linkedList.get(1));
        assertEquals("var2",linkedList.get(2));
    }

    @Test
    void clear() {
        linkedList.clear();
        assertEquals(null,linkedList.get(0));
        assertEquals(null,linkedList.get(1));
        assertEquals(null,linkedList.get(2));
        assertEquals(null,linkedList.get(3));
        assertEquals(0,linkedList.size());
    }

    @Test
    void size() {
        assertEquals(3,linkedList.size());
    }
}