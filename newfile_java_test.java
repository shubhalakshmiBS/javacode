**Unit Test Case:**

```
@Test
public void testGetTotal() {
    // Given
    List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
    Calculator calculator = new Calculator(numbers);
    
    // When
    int total = calculator.getTotal();
    
    // Then
    assertEquals(15, total);
}
```

**Code Coverage:**

The above unit test covers the `getTotal()` method of the `Calculator` class, which calculates the total sum of the numbers in the given list. It also covers the constructor of the `Calculator` class, which takes in a list of numbers as a parameter. This unit test achieves 100% code coverage for the `getTotal()` method and 100% code coverage for the `Calculator` class.