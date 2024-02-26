**Unit Test Case:**

```
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumTest {

    @Test
    public void testSum() {
        int[] myArray = {1, 5, 10, 25};
        int sum = 0;
        int i;

        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        assertEquals(41, sum);
    }
}
```

**Code Coverage:**

The code coverage for this unit test is 100%, as it covers all lines of code in the given code snippet.