package com.zerobank.stepdefinitions;

import com.zerobank.pages.AccountSummaryPage;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

import java.util.List;

public class AccountSummaryStepDefinitions {

    AccountSummaryPage accountSummaryPage = new AccountSummaryPage();

    @When("user navigates to {string} page")
    public void user_navigates_to_page(String tabName) {
        System.out.printf("User navigates to %s page\n", tabName);
        accountSummaryPage.navigateTo(tabName);
    }

    @Then("Account Summary page should have the following account types")
    public void account_Summary_page_should_have_the_following_account_types(List<String> dataTable) {
        System.out.println("Expected values :: " + dataTable);
        Assert.assertEquals(accountSummaryPage.getAccountTypes(), dataTable);
    }

    @Then("Credit Accounts table should have the following columns")
    public void credit_Accounts_table_should_have_the_following_columns(List<String> dataTable) {
        System.out.println("Expected values :: " + dataTable);
        Assert.assertEquals(accountSummaryPage.getCreditAccColumns(), dataTable);
    }


}
