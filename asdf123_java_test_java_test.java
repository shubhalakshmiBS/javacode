@Test
        public void testCalculateTotalPriceWithEmptyCart() {
            //given
            ShoppingCart cart = new ShoppingCart();
            double expectedTotal = 0.00;
            
            //when
            double actualTotal = cart.calculateTotalPrice();
            
            //then
            assertEquals(expectedTotal, actualTotal, 0.001);
        }
        
        Code coverage: 100%