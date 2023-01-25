import static org.junit.Assert.*;

import org.junit.*;

public class ArrayTests {
    @Test
    public void testReverseInPlace() {
        int[] input1 = {3};
        ArrayExamples.reverseInPlace(input1);
        assertArrayEquals(new int[]{3}, input1);
    }

    @Test
    public void testReverseInPlace2() {
        int[] input = {1, 2, 3, 4, 5};
        ArrayExamples.reverseInPlace(input);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, input);
    }

    @Test
    public void testReversed() {
        int[] input1 = {};
        assertArrayEquals(new int[]{}, ArrayExamples.reversed(input1));
    }

    @Test
    public void testReversed2() {
        int[] input = {1, 2, 3, 4, 5};
        int[] output = ArrayExamples.reversed(input);
        assertArrayEquals(new int[]{5, 4, 3, 2, 1}, output);
    }

    @Test
    public void testAverageWithoutLowest() {
        double[] input1 = {};
        double[] input2 = {1, 1, 1, 1, 3};
        double[] input3 = {1, 2, 3, 4, 7};
        double[] input4 = {-5, -2, 0, 4, 6};

        assertEquals(0.0, ArrayExamples.averageWithoutLowest((input1)), 0.1);
        assertEquals(0.75, ArrayExamples.averageWithoutLowest((input2)), 0.1);
        assertEquals(4.0, ArrayExamples.averageWithoutLowest((input3)), 0.1);
        assertEquals(2.0, ArrayExamples.averageWithoutLowest((input4)), 0.1);
    }
}
