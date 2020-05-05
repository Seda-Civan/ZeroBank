package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;

import java.util.List;

public class AccountActivityPage extends BasePage {

    @FindBy(id = "aa_accountId")
    protected WebElement accountOptions;

    @FindBy(xpath = "//table//th")
    protected List<WebElement> transactionColumnNames;

    /**
     * This method is to get default option in the Account drop down.
     * @return, default Account type
     */
    public String getDefaultAccount(){
        BrowserUtils.waitForPageToLoad(20);
         return new Select(accountOptions).getFirstSelectedOption().getText();
    }

    public void clickAccountDropDown(){
        BrowserUtils.waitForPageToLoad(20);
        wait.until(ExpectedConditions.elementToBeClickable(accountOptions)).click();
    }

    /**
     * This method is to get Account drop down options: Savings, Checking, Loan, Credit Card, Brokerage.
     * @return, Savings, Checking, Loan, Credit Card, Brokerage as a List of Strings
     */
    public List<String> getAccountOptions(){
        BrowserUtils.waitForPageToLoad(20);
        return BrowserUtils.getTextFromWebElements(new Select(accountOptions).getOptions());
    }

    /**
     * This method is to get Transactions table column names. Date, Description, Deposit, Withdrawal.
     * @return,  Date, Description, Deposit, Withdrawal as a List of Strings
     */
    public List<String> getTransactionTableColumnNames(){
        BrowserUtils.waitForPageToLoad(20);
        BrowserUtils.wait(3);
        return BrowserUtils.getTextFromWebElements(transactionColumnNames);

    }








}
