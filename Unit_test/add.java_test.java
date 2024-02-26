Unit Test Case:

import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class MyArrayTest {

    // Test case for calculating sum of array elements
    @Test
    public void testSumOfArrayElements() {
        // Given
        int[] myArray = {1, 5, 10, 25};
        int expectedSum = 41;
        
        // When
        int actualSum = MyArray.calculateSum(myArray);
        
        // Then
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100%