import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LinkedListTests {
    @Test
    public void testLinkedList() {
        LinkedList list = new LinkedList();
        list.prepend(5);
        list.prepend(1);
        list.append(10);
        list.append(12);

        assertEquals("1 5 10 12 ", list.toString());
        assertEquals(1, list.first());
        assertEquals(12, list.last());
        assertEquals(4, list.length());
    }
}
