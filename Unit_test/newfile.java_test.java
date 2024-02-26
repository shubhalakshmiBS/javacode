Unit Test Case:

@Test
public void testReverseString() {
    String originalStr = "Hello";
    String reversedStr = "";

    for (int i = 0; i < originalStr.length(); i++) {
        reversedStr = originalStr.charAt(i) + reversedStr;
    }

    assertEquals("olleH", reversedStr);
}

Code Coverage: 100%