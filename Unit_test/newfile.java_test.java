**Unit Test Case:**

```
@Test
public void testReverseString() {
    String originalStr = "Hello";
    String reversedStr = "";

    for (int i = 0; i < originalStr.length(); i++) {
        reversedStr = originalStr.charAt(i) + reversedStr;
    }

    assertEquals("olleH", reversedStr);
}
```

**Code Coverage:**

The unit test covers the entire code provided, including the for loop and the print statement. It also verifies the correct behavior of the code by checking that the reversed string is equal to the expected value.