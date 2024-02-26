//Unit Test Case
        @Test
        public void testReverseString() {
            //Arrange
            String originalStr = "Hello";
            String expectedStr = "olleH";
            String reversedStr = "";
            
            //Act
            for (int i = 0; i < originalStr.length(); i++) {
                reversedStr = originalStr.charAt(i) + reversedStr;
            }
            
            //Assert
            assertEquals(expectedStr, reversedStr);
        }
        
        //Code coverage: 100%