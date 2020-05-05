package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

public class LoginPage extends BasePage {


    @FindBy(id = "signin_button")
    protected WebElement signinBtn_homepage;

    @FindBy(id = "user_login")
    protected WebElement loginUsernameInput;

    @FindBy(id = "user_password")
    protected WebElement passwordInput;

    @FindBy(id = "user_remember_me")
    protected WebElement keepMeSignedIn;

    @FindBy(css = "[type=\"submit\"]")
    protected WebElement singinBtn;

    @FindBy(partialLinkText = "Forgot your password ?")
    protected WebElement forgotYourPassword;

    @FindBy(id = "user_email")
    protected WebElement emailForgotPassword;

    @FindBy(css = "[name=\"submit\"]")
    protected WebElement sendPasswordBtn;

    @FindBy(css = "[class=\"alert alert-error\"]")
    protected WebElement errorMessage;


    public void clickSignin() {
        BrowserUtils.waitForPageToLoad(15);
        wait.until(ExpectedConditions.elementToBeClickable(signinBtn_homepage)).click();
    }

    /**
     * login as default user
     * Credentials will be retrieved from configuration.properties file
     */
    public void login() {
        BrowserUtils.waitForPageToLoad(15);
        loginUsernameInput.sendKeys(ConfigurationReader.getProperty("username"));
        passwordInput.sendKeys(ConfigurationReader.getProperty("password"));
        wait.until(ExpectedConditions.elementToBeClickable(keepMeSignedIn)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(singinBtn)).click();
    }


    /**
     * Method to login with parameters
     * Login as specific user
     *
     * @param username
     * @param password
     */
    public void login(String username, String password) {
        BrowserUtils.waitForPageToLoad(15);
        loginUsernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        wait.until(ExpectedConditions.elementToBeClickable(keepMeSignedIn)).click();
        BrowserUtils.wait(2);
        wait.until(ExpectedConditions.elementToBeClickable(singinBtn)).click();
    }

    public String getErrorMsg(){
        BrowserUtils.wait(2);
        return wait.until(ExpectedConditions.presenceOfElementLocated(By.cssSelector("[class=\"alert alert-error\"]"))).getText().trim();
    }

}


/*
• To check Element Present:
• or
if(driver.findElements(By.xpath("value")).size() != 0){ System.out.println("Element is Present");
}else{
System.out.println("Element is Absent");}
if(driver.findElement(By.xpath("value"))!= null){ System.out.println("Element is Present");
}else{
System.out.println("Element is Absent"); }
• To check Visible:
if(driver.findElement(By.cssSelector("a > font")).isDisplayed()){ System.out.println("Element is Visible");
}else{
System.out.println("Element is InVisible"); }
• To check Enable:
if(driver.findElement(By.cssSelector("a > font")).isEnabled()){ System.out.println("Element is Enable");
}else{
System.out.println("Element is Disabled"); }
• To check text present
if(driver.getPageSource().contains("Text to check")){ System.out.println("Text is present");
}else{
System.out.println("Text is absent"); }
 */