Unit Test Case:
```
import org.junit.Test;
import static org.junit.Assert.*;

public class RectangleTest {

    @Test
    public void testCalculateArea() {
        int length = 5;
        int width = 2;
        int expectedArea = 10;

        int actualArea = Rectangle.calculateArea(length, width);

        assertEquals(expectedArea, actualArea);
    }
}
```

Code Coverage: 100% (based on the given code snippet)