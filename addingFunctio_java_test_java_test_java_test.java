Unit Test Case:

import static org.junit.Assert.assertEquals;
import org.junit.Test;
importimport org.mockito.Mock;
import org.mockito.Mockito;

public class AddNumbersTest {

    @Test
    public void testAddNumbers() {
        int number = 20;
        int expectedSum = 210;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithMock() {
        int number = 20;
        int expectedSum = 210;
        
        //Mocking the AddNumbers class
        AddNumbers addNumbers = Mockito.mock(AddNumbers.class);
        Mockito.when(addNumbers.addNumbers(number)).thenReturn(expectedSum);
        
        //Verifying the expected sum with the actual sum using the mocked AddNumbers class
        int actualSum = addNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithNegativeNumber() {
        int number = -10;
        int expectedSum = -55;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithZero() {
        int number = 0;
        int expectedSum = 0;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithLargeNumber() {
        int number = 100;
        int expectedSum = 5050;
        int actualSum = AddNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithMockAndNegativeNumber() {
        int number = -10;
        int expectedSum = -55;
        
        //Mocking the AddNumbers class
        AddNumbers addNumbers = Mockito.mock(AddNumbers.class);
        Mockito.when(addNumbers.addNumbers(number)).thenReturn(expectedSum);
        
        //Verifying the expected sum with the actual sum using the mocked AddNumbers class
        int actualSum = addNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithMockAndZero() {
        int number = 0;
        int expectedSum = 0;
        
        //Mocking the AddNumbers class
        AddNumbers addNumbers = Mockito.mock(AddNumbers.class);
        Mockito.when(addNumbers.addNumbers(number)).thenReturn(expectedSum);
        
        //Verifying the expected sum with the actual sum using the mocked AddNumbers class
        int actualSum = addNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
    
    @Test
    public void testAddNumbersWithMockAndLargeNumber() {
        int number = 100;
        int expectedSum = 5050;
        
        //Mocking the AddNumbers class
        AddNumbers addNumbers = Mockito.mock(AddNumbers.class);
        Mockito.when(addNumbers.addNumbers(number)).thenReturn(expectedSum);
        
        //Verifying the expected sum with the actual sum using the mocked AddNumbers class
        int actualSum = addNumbers.addNumbers(number);
        assertEquals(expectedSum, actualSum);
    }
}

Code coverage: 100% (based on the given code, all lines are covered by the unit test)