Feature: User should be able to compare two products,
  So that I can choose the better product

  @compare
  Scenario: User should be able to compare two products
    Given user is in the home page
    When user compares two products
    Then user should be able to navigate to products comparison page
