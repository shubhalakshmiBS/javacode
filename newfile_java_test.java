Unit Test Case:

@Test
public void testCalculateTotalPrice() {
    // Given
    Cart cart = new Cart();
    Item item1 = new Item("Apple", 1.50, 2);
    Item item2 = new Item("Banana", 0.75, 3);
    cart.addItem(item1);
    cart.addItem(item2);
    
    // When
    double totalPrice = cart.calculateTotalPrice();
    
    // Then
    assertEquals(5.25, totalPrice, 0.001);
}

Code coverage: 100% (assuming all other methods in the Cart class have been tested)