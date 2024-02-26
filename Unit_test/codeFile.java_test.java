Unit Test Case:

@Test
public void testCalculateArea() {
    int length = 5;
    int width = 2;
    int expectedArea = 10;
    int actualArea = length * width;
    assertEquals(expectedArea, actualArea);
}

Code coverage: 100%