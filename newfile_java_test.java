Unit Test Case:

@Test
public void testGetTotal() {
    List<Integer> numbers = new ArrayList<>();
    numbers.add(1);
    numbers.add(2);
    numbers.add(3);
    numbers.add(4);
    numbers.add(5);

    Calculator calculator = new Calculator();
    int total = calculator.getTotal(numbers);

    assertEquals(15, total);
}

Code coverage: 100%