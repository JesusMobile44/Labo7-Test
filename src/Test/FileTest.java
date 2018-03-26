package Test;

import Collection.File;
import Collection.List;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

/**
 * Created by BelSi1731422 on 2018-03-26.
 */
class FileTest {
    File file;
    @BeforeEach
    void setUp() {
        file = new File();
        file.add("var0");
        file.add("var1");
        file.add("var2");

    }

    @Test
    void remove() {
        assertEquals("var0",file.remove());
        assertEquals("var1",file.remove());
    }

    @Test
    void peek() {
        assertEquals("var0",file.peek());
        assertEquals("var0",file.peek());
    }

    @Test
    void clear() {
        file.clear();
        assertEquals(0,file.size());
    }

    @Test
    void size() {
        assertEquals(3,file.size());
    }

}