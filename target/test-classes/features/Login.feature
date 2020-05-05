Feature: Login
  Only authorized users should be able to login to the application

  Background: open login page
    Given user is on the home page
    And user clicks on signin button to access login page

  @authorized_user
  Scenario: Login with valid credentials
    When user enters valid username and password on login page
    Then user should verify that title is "Zero - Account Summary"

  @invalid_credentials
  Scenario Outline: Login with invalid credentials
    When user enters invalid "<username>" and "<password>" on login page
    Then error message "Login and/or password are wrong." is displayed

    Examples:
      | username      | password      |
      | wrongUsername | password      |
      | username      | wrongPassword |
      |               | password      |
      | username      |               |
      |               |               |