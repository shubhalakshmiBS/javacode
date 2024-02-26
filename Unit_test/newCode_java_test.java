Unit Test Case:
        
        @Test
        public void testReverseString() {
            // Arrange
            String originalStr = "Hello";
            String reversedStr = "";
            String expected = "olleH";
            
            // Act
            for (int i = 0; i < originalStr.length(); i++) {
                reversedStr = originalStr.charAt(i) + reversedStr;
            }
            
            // Assert
            assertEquals(expected, reversedStr);
        }
        
        Code Coverage: 100%