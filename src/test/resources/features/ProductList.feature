Feature: Product List


  Scenario Outline: The user should be able to display the "add to cart" bar after hovering over the image
    Given the user is on the main page
    When the user clicks on the "<page>"
    And the user hovers over the images
    Then the user should be able to see "ADD TO CART" bar

    Examples:
      | page |
      | 1    |
      | 2    |
      | 3    |
      | 4    |
      | 5    |
      | 6    |