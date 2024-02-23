Unit Test Case:
        
        @Test
        public void testGetTotalPrice() {
            //given
            Product product1 = new Product("Apple", 1.50, 2);
            Product product2 = new Product("Banana", 2.00, 3);
            Product product3 = new Product("Orange", 1.00, 4);
            List<Product> products = new ArrayList<>();
            products.add(product1);
            products.add(product2);
            products.add(product3);
            ShoppingCart shoppingCart = new ShoppingCart(products);
            
            //when
            double totalPrice = shoppingCart.getTotalPrice();
            
            //then
            assertEquals(10.50, totalPrice, 0.001);
        }
        
        Code coverage: 100%