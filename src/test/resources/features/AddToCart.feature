Feature: Add to Cart

  @wip
  Scenario: User should be able to add products to cart
    Given the user is on the main page
    When the user clicks on the add to cart bar on the product on page 1
      | Watercolor painting |
      | Watch               |
    When the user clicks on the add to cart bar on the product on page 2
      | Stream during daytime |
    When the user clicks on the add to cart bar on the product on page 3
      | Red ferrari |
      | Mercedes    |
    When the user clicks on the add to cart bar on the product on page 4
      | Green parrot |
    When the user clicks on the add to cart bar on the product on page 5
      | Baked pizza                      |
      | Black and white short coated dog |
    When the user clicks on the add to cart bar on the product on page 6
      | Abstract painting |
    Then the user should be able to see the products in the cart and the counter badge
    And the should be able to remove the items by clicking on the clear button