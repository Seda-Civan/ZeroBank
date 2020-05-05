package com.zerobank.stepdefinitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class LoginStepDefinitions {

    LoginPage loginPage = new LoginPage();

    @Given("user is on the home page")
    public void user_is_on_the_home_page() {
        System.out.println("Open login page");
        String URL = ConfigurationReader.getProperty("URL");
        System.out.println("URL :: " + URL);
        Driver.getDriver().get(URL);
    }

    @When("user clicks on signin button to access login page")
    public void user_clicks_on_signin_button_to_access_login_page() {
        loginPage.clickSignin();
    }

    @When("user enters valid username and password on login page")
    public void user_enters_valid_username_and_password_on_login_page() {
        System.out.println("Login with username and password");
        loginPage.login();
    }


    @Then("user should verify that title is {string}")
    public void user_should_verify_that_title_is(String pageTitle) {
        System.out.println("Verify that title is " +pageTitle);
        String actual = loginPage.getPageTitle();
        Assert.assertEquals(actual, pageTitle);
    }

    @When("user enters invalid {string} and {string} on login page")
    public void user_enters_invalid_and_on_login_page(String username, String password) {
        System.out.printf("Login with user name \"%s\" and \"%s\" password\n", username, password);
        loginPage.login(username, password);
    }

    @Then("error message {string} is displayed")
    public void error_message_is_displayed(String errorMsg) {
        System.out.printf("Verify that error message \"%s\" is displayed\n" , errorMsg);
        String actual = loginPage.getErrorMsg();
        Assert.assertEquals(actual, errorMsg );
    }



}
