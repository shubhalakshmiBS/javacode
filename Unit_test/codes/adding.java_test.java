Unit Test Case:

@Test
public void testSumOfArray() {
    int[] myArray = {1, 5, 10, 25};
    int sum = 0;
    int i; 

    // Loop through the array elements and store the sum in the sum variable
    for (i = 0; i < myArray.length; i++) {
      sum += myArray[i];
    }

    assertEquals(41, sum);
}

Code Coverage: 100%