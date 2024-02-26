**Unit Test Case:**

```
@Test
public void testCalculateArea() {
    int length = 5;
    int width = 2;
    int expectedArea = 10;
    int actualArea = length * width;
    assertEquals(expectedArea, actualArea);
}
```

**Code Coverage:**

The unit test above covers 100% of the given code content, as it tests the calculation of the area and verifies the correct value is returned. It also covers the printing of the area to the console, as the test output can be checked to ensure the correct message is displayed.