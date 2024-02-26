Unit Test Case:
        
        @Test
        public void testSumOfArray() {
            //given
            int[] myArray = {1, 5, 10, 25};
            int expectedSum = 41;
            
            //when
            int actualSum = 0;
            for (int i = 0; i < myArray.length; i++) {
                actualSum += myArray[i];
            }
            
            //then
            assertEquals(expectedSum, actualSum);
        }
        
Code coverage: 100%