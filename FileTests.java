import org.junit.Test;

import java.io.File;
import java.io.IOException;

import static org.junit.Assert.assertArrayEquals;

public class FileTests {
    @Test
    public void testFile() throws IOException {
        File[] expected1 = {new File("some-files/a.txt"),
                new File("some-files/even-more-files/a.txt"),
                new File("some-files/even-more-files/d.java"),
                new File("some-files/more-files/b.txt"),
                new File("some-files/more-files/c.java")};
        File[] expected2 =
                {new File("some-files/more-files/b.txt"),
                        new File("some-files/more-files/c.java")};
        File[] expected3 = {new File("some-files/a.txt")};

        assertArrayEquals(expected1,
                FileExample.getFiles(new File("some-files/")).toArray());
        assertArrayEquals(expected2,
                FileExample.getFiles(new File("some-files/more-files"))
                        .toArray());
        assertArrayEquals(expected3,
                FileExample.getFiles(new File("some-files/a.txt")).toArray());
    }
}
