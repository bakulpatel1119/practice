Feature: User should be able to change the currency

  @changecurrency
  Scenario: User should be able to change currency to Euro for all featured products
  Given user is in the home page
  When user selects currency to Euro
  Then user should be able to see prices in Euro for all featured products










