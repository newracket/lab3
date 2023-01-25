import org.junit.Test;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListTests {
    @Test
    public void testFilter() {
        List<String> input = Arrays.asList("A", "B", "C", "D", "E");
        List<String> output = ListExamples.filter(input, s -> !s.contains("D"));
        assertArrayEquals(new String[]{"A", "B", "C", "E"}, output.toArray());
    }

    @Test
    public void testMerge() {
        List<String> input1 = Arrays.asList("A", "a", "b", "d", "f", "q");
        List<String> input2 = Arrays.asList("b", "e", "g", "z");
        List<String> output = ListExamples.merge(input1, input2);
        assertArrayEquals(
                new String[]{"A", "a", "b", "b", "d", "e", "f", "g", "q", "z"},
                output.toArray());
    }
}
