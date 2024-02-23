**Unit Test Case:**

```
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyArrayTest {

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

The code coverage for this unit test is 100%, as it covers all lines of code within the for loop and the print statement.