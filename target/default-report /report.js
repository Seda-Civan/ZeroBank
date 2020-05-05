$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("file:src/test/resources/features/AccountActivity.feature");
formatter.feature({
  "name": "Account Activity",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@account_activity"
    }
  ]
});
formatter.background({
  "name": "open login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin button to access login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_clicks_on_signin_button_to_access_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password on login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_enters_valid_username_and_password_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Account Activity\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryStepDefinitions.user_navigates_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account Activity page title should be Zero - Account Activity",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account_activity"
    }
  ]
});
formatter.step({
  "name": "user should verify that title is \"Zero - Account Activity\"",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_should_verify_that_title_is(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "open login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin button to access login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_clicks_on_signin_button_to_access_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password on login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_enters_valid_username_and_password_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Account Activity\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryStepDefinitions.user_navigates_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Savings is default option on Accounts drop down",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account_activity"
    }
  ]
});
formatter.step({
  "name": "user should verify that default option is \"Savings\" in the Account drop down",
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityStepDefinitions.user_should_verify_that_default_option_is_in_the_Account_drop_down(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "open login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin button to access login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_clicks_on_signin_button_to_access_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password on login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_enters_valid_username_and_password_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Account Activity\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryStepDefinitions.user_navigates_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Account drop down options",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account_activity"
    }
  ]
});
formatter.step({
  "name": "user clicks on Account drop down",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityStepDefinitions.user_clicks_on_Account_drop_down()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "Account drop down should have the following options",
  "rows": [
    {},
    {},
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityStepDefinitions.account_drop_down_should_have_the_following_options(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
formatter.background({
  "name": "open login page",
  "description": "",
  "keyword": "Background"
});
formatter.before({
  "status": "passed"
});
formatter.step({
  "name": "user is on the home page",
  "keyword": "Given "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_is_on_the_home_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user clicks on signin button to access login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_clicks_on_signin_button_to_access_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user enters valid username and password on login page",
  "keyword": "And "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.LoginStepDefinitions.user_enters_valid_username_and_password_on_login_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "user navigates to \"Account Activity\" page",
  "keyword": "When "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountSummaryStepDefinitions.user_navigates_to_page(java.lang.String)"
});
formatter.result({
  "status": "passed"
});
formatter.scenario({
  "name": "Transactions table column names",
  "description": "",
  "keyword": "Scenario",
  "tags": [
    {
      "name": "@account_activity"
    },
    {
      "name": "@1"
    }
  ]
});
formatter.step({
  "name": "Transactions table should have the following column names",
  "rows": [
    {},
    {},
    {},
    {}
  ],
  "keyword": "Then "
});
formatter.match({
  "location": "com.zerobank.stepdefinitions.AccountActivityStepDefinitions.transactions_table_should_have_the_following_column_names(java.util.List\u003cjava.lang.String\u003e)"
});
formatter.result({
  "status": "passed"
});
formatter.after({
  "status": "passed"
});
});