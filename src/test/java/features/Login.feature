Feature: Login
  This feature deals with the login functionality of the facebook application

  Scenario: Login with the incorrect username and password
    Given Navigate to "https://facebook.com"
    When I enter the username "test@gmail.com"
    And I enter the password "test123"
    And I click on the login button
    Then I should see the error message

  Scenario: Login with the correct username and password
    Given User is already navigate to facebook url
    When I enter the username "yourfacebookname@yahoo.com"
    And I enter the password "yourfacebookpassword"
    And I click on the login button
    Then I should see profile icon on home page