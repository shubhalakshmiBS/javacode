**Unit Test Case:**

```
@Test
public void testGetTotalPrice() {
    // Arrange
    List<Item> items = new ArrayList<>();
    items.add(new Item("Apple", 2, 1.50));
    items.add(new Item("Banana", 3, 2.00));
    items.add(new Item("Orange", 1, 0.75));
    ShoppingCart cart = new ShoppingCart(items);
    
    // Act
    double totalPrice = cart.getTotalPrice();
    
    // Assert
    assertEquals(6.75, totalPrice, 0.001);
}
```

**Code Coverage:** 100% (assuming all other methods in the ShoppingCart class have been properly tested)