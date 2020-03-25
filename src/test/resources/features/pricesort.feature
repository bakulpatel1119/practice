Feature: User should be able to see products sorted in price descending order

  @pricesort
  Scenario: User should be able to see products sorted in price descending order
  Given user is in the desktops page
  When user selects price high to low
  Then user should be able to see products sorted in price descending order





