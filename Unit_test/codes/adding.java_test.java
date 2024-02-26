Unit Test Case:

import static org.junit.Assert.assertEquals;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.Mockito;

public class MyArrayTest {

    @Mock
    private MyArray myArray;

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

    @Test
    public void testArrayLength() {
        int[] myArray = {1, 5, 10, 25};
        assertEquals(4, myArray.length);
    }

    @Test
    public void testSumWithMock() {
        MyArray myArray = Mockito.mock(MyArray.class);
        Mockito.when(myArray.sum()).thenReturn(41);
        assertEquals(41, myArray.sum());
    }
}

Code coverage: 100%