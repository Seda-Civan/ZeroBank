package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountActivityPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountActivityStepDefinitions {

    AccountActivityPage activityPage = new AccountActivityPage();

    @Then("user should verify that default option is {string} in the Account drop down")
    public void user_should_verify_that_default_option_is_in_the_Account_drop_down(String account) {
        System.out.println("Default account is :: "+account);
        Assert.assertEquals(account, activityPage.getDefaultAccount());
    }

    @When("user clicks on Account drop down")
    public void user_clicks_on_Account_drop_down() {
        activityPage.clickAccountDropDown();
    }


    @Then("Account drop down should have the following options")
    public void account_drop_down_should_have_the_following_options(List<String> accounts) {
        System.out.println("Expected values :: " + accounts);
        Assert.assertEquals(accounts, activityPage.getAccountOptions());
    }

    @Then("Transactions table should have the following column names")
    public void transactions_table_should_have_the_following_column_names(List<String> tableColumnNames) {
        System.out.println("Expected values :: " + tableColumnNames);
        Assert.assertEquals(tableColumnNames, activityPage.getTransactionTableColumnNames());
    }


}
