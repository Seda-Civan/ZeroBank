@account_summary
Feature: Account Summary

  Background: open login page
    Given user is on the home page
    And user clicks on signin button to access login page
    And user enters valid username and password on login page

  Scenario: Account Summary page title should be Zero - Account Summary
    When user navigates to "Account Summary" page
    Then user should verify that title is "Zero - Account Summary"

  Scenario: Account Summary page account types
    When user navigates to "Account Summary" page
    Then Account Summary page should have the following account types
      | Cash Accounts       |
      | Investment Accounts |
      | Credit Accounts     |
      | Loan Accounts       |

  Scenario: Credit Account table columns
    When user navigates to "Account Summary" page
    Then Credit Accounts table should have the following columns
      | Account     |
      | Credit Card |
      | Balance     |