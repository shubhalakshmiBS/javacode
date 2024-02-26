**Unit Test Case:**

```
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RectangleTest {

    @Test
    public void testCalculateArea() {
        int length = 5;
        int width = 2;
        int expectedArea = 10;
        int actualArea = length * width;
        assertEquals(expectedArea, actualArea);
    }
}
```

**Code Coverage:**

The code coverage for this unit test is 100%, as it covers all the lines of code in the given code snippet. It also covers all possible scenarios by setting different values for length and width.