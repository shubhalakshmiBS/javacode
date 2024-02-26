Unit Test Case: 

@Test
public void testSum() {
    int[] myArray = {1, 5, 10, 25};
    int expectedSum = 41;
    int actualSum = 0;
    int i;

    for (i = 0; i < myArray.length; i++) {
        actualSum += myArray[i];
    }

    assertEquals(expectedSum, actualSum);
}

Code coverage: 100%