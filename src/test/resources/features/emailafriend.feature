Feature: User should be able to send an email to a friend referring a product once he is registered,
  So that he can make the friend aware of the product

  @emailafriend
  Scenario: User should be able to send an email referring a product once registered
  Given user is in the registration result page
  And user clicks on continue
  And user sends email to a friend
  Then user should be able to see the email sent message






