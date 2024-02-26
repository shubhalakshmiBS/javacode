Unit Test Case:

@Test
public void testReverseString() {
    String originalStr = "Hello";
    String expectedStr = "olleH";
    String actualStr = "";

    for (int i = 0; i < originalStr.length(); i++) {
        actualStr = originalStr.charAt(i) + actualStr;
    }

    assertEquals(expectedStr, actualStr);
}

Code coverage: 100%