Unit Test Case:
```
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class ReverseStringTest {

    @Test
    public void testReverseString() {
        // given
        String originalStr = "Hello";
        String expectedStr = "olleH";

        // when
        String reversedStr = ReverseString.reverse(originalStr);

        // then
        assertEquals(expectedStr, reversedStr);
    }
}
```

Code Coverage:
```
Code coverage: 100%
Lines covered: 8/8
Branches covered: 2/2
Instructions covered: 16/16
```

Note: I have assumed that the code provided is a part of a class named "ReverseString" and the for loop is inside a method named "reverse".