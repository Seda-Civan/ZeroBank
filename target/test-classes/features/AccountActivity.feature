@account_activity
Feature: Account Activity

  Background: open login page
    Given user is on the home page
    And user clicks on signin button to access login page
    And user enters valid username and password on login page
    When user navigates to "Account Activity" page

  Scenario: Account Activity page title should be Zero - Account Activity
    Then user should verify that title is "Zero - Account Activity"

  Scenario: Savings is default option on Accounts drop down
    Then user should verify that default option is "Savings" in the Account drop down

  Scenario: Account drop down options
    And user clicks on Account drop down
    Then Account drop down should have the following options
      | Savings     |
      | Checking    |
      | Savings     |
      | Loan        |
      | Credit Card |
      | Brokerage   |

    @1
  Scenario: Transactions table column names
    Then Transactions table should have the following column names
      | Date        |
      | Description |
      | Deposit     |
      | Withdrawal  |
