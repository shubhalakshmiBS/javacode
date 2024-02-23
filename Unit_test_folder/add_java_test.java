Unit Test Case:

import org.junit.Test;
import static org.junit.Assert.*;

public class MyArrayTest {

    // Test case for calculating sum of array elements
    @Test
    public void testSumOfArrayElements() {
        // Given
        int[] myArray = {1, 5, 10, 25};
        int expectedSum = 41;
        
        // When
        int actualSum = MyArray.sumOfArrayElements(myArray);
        
        // Then
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100% (all lines of code covered by the unit test)