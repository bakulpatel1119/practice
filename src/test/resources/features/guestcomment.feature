Feature: User should be able to add a comment as a guest

  @guestcomment
  Scenario: User should be able to add a comment about Nopcommerce as a guest
  Given user is in the about nopcommerce page
  When user adds a comment
  And user clicks on new comment
  Then verify comment added message is visible








