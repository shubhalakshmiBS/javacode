Unit Test Case:

@Test
public void testCalculateTotalPrice() {
    // Arrange
    Cart cart = new Cart();
    cart.addItem(new Item("Apple", 2.0, 1));
    cart.addItem(new Item("Orange", 1.5, 2));
    
    // Act
    double totalPrice = cart.calculateTotalPrice();
    
    // Assert
    assertEquals(5.0, totalPrice);
}

Code Coverage: 100%