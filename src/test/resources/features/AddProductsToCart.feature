Feature: Add products to cart

  Scenario: Successful add products to cart
    Given I open the app
    When I enter username
    And I choose country
    And I tap on let's go
    And I add two products
    And I click on cart
    And I check the products exist
    Then I validate the total price is right
