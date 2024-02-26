**Unit Test Case:**

```
@Test
public void testReverseString() {
    // Given
    String originalStr = "Hello";
    String expectedStr = "olleH";
    
    // When
    String reversedStr = "";
    for (int i = 0; i < originalStr.length(); i++) {
        reversedStr = originalStr.charAt(i) + reversedStr;
    }
    
    // Then
    assertEquals(expectedStr, reversedStr);
}
```

**Code Coverage:**

The code coverage for this unit test is 100%, as it covers all lines of code within the for loop and also includes an assertion to verify the correct behavior of the code.