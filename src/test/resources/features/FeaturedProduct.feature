Feature: Featured products

  Background:
    Given the user is on the main page


  Scenario Outline: Featured products should be displayed in the product list

    When the user clicks on the "<page>"
    Then the user should be able to see the "<featured products>"

    Examples:
      | page | featured products                       |
      | 1    | Watercolor painting                     |
      | 1    | Watch                                   |
      | 1    | Three Men Standing Near Waterfalls      |
      | 2    | Telephone iphone                        |
      | 2    | Ring                                    |
      | 3    | People walking at the desert during day |
      | 4    | Green parrot                            |
      | 5    | Cheese on wooden tray                   |
      | 5    | Baked pizza                             |
#    The next one's result is negative.
#      | 1    | Vegetable salad on plate                |
