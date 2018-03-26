package Test;

import Collection.ArrayList;
import Collection.List;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by BelSi1731422 on 2018-03-26.
 */
class ArrayListTest {
    List arrayList;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        arrayList = new ArrayList();
        arrayList.add("var0");
        arrayList.add("var1");
        arrayList.add("var2");
    }

    @org.junit.jupiter.api.Test
    void add() {
        arrayList.add(3,"var3");
        arrayList.add(12,"var4");
        arrayList.add(2,"var5");
        arrayList.add(-1,"var6");
        assertEquals("var0",arrayList.get(0));
        assertEquals("var1",arrayList.get(1));
        assertEquals("var5",arrayList.get(2));
        assertEquals("var2",arrayList.get(3));
        assertEquals("var3",arrayList.get(4));
        assertEquals(null,arrayList.get(12));
        assertEquals(null,arrayList.get(-1));
    }

    @org.junit.jupiter.api.Test
    void set() {
        arrayList.set(12,"var3");
        arrayList.set(1,"var4");
        arrayList.set(-1,"var5");
        assertEquals("var0",arrayList.get(0));
        assertEquals("var4",arrayList.get(1));
        assertEquals("var2",arrayList.get(2));
        assertEquals(null,arrayList.get(-1));
        assertEquals(null,arrayList.get(12));
    }

    @org.junit.jupiter.api.Test
    void get() {
        assertEquals("var0", arrayList.get(0));
        assertEquals("var1", arrayList.get(1));
        assertEquals("var2", arrayList.get(2));
        assertEquals(null, arrayList.get(3));
    }

    @org.junit.jupiter.api.Test
    void remove() {
        arrayList.remove(1);
        arrayList.remove(12);
        arrayList.remove(-1);
        assertEquals("var0", arrayList.get(0));
        assertEquals("var2", arrayList.get(1));
        assertEquals(null, arrayList.get(2));
        assertEquals(null, arrayList.get(12));
        assertEquals(null, arrayList.get(-1));
    }

    @org.junit.jupiter.api.Test
    void clear() {
        arrayList.clear();
        assertEquals(null, arrayList.get(0));
        assertEquals(null, arrayList.get(1));
        assertEquals(null,arrayList.get(2));
        assertEquals(null,arrayList.get(12));
        assertEquals(null,arrayList.get(-1));
        assertEquals(0, arrayList.size());
    }

    @org.junit.jupiter.api.Test
    void size() {
        assertEquals(3,arrayList.size());
    }

    @org.junit.jupiter.api.Test
    void grow(){
        for(int i=arrayList.size();i<15;i++) {
            arrayList.add("var"+i);
        }
        assertEquals("var12", arrayList.get(12));
        assertEquals(15, arrayList.size());
    }
    @org.junit.jupiter.api.Test
    void addAfterClear() {
        arrayList.clear();
        arrayList.add("var0");
        arrayList.add("var1");
        arrayList.add("var2");
        assertEquals("var0", arrayList.get(0));
        assertEquals("var1", arrayList.get(1));
        assertEquals("var2", arrayList.get(2));
    }
}