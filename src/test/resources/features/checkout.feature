Feature: User should be able to checkout Successfully,
  So that he can buy any product

@checkout
  Scenario: User should be able to checkout successfully
  Given user is in the desktops page
  When user follows checkout as a guest
  And user enters payment details
  And user clicks on confirm
  Then user should be able to checkout successfully






