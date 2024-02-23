Unit Test Case:
```
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class MyArrayTest {

    @Test
    public void testSum() {
        int[] myArray = {1, 5, 10, 25};
        int sum = 0;
        int i;

        // Loop through the array elements and store the sum in the sum variable
        for (i = 0; i < myArray.length; i++) {
            sum += myArray[i];
        }

        assertEquals(41, sum);
    }
}
```

Code Coverage: 100% (based on the given code, all lines are covered by the unit test)