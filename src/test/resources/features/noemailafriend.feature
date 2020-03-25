Feature: User should not be able to send an email to a friend when he is not registered

 @noemailafriend
  Scenario: User should not be able to send an email to a friend when not registered
  Given user is in the home page
  When user attempts to send an email to a friend
  Then user should be able see error message





