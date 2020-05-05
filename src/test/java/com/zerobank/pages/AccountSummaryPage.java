package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;


public class AccountSummaryPage extends BasePage {

    @FindBy(xpath = "//div//h2")
    protected List<WebElement>  accountTypes;

    @FindBy(xpath = "//h2[text()=\"Credit Accounts\"]/following-sibling::div[1]//th")
    protected List<WebElement> creditAccColumns;

    public List<String> getAccountTypes(){
        BrowserUtils.waitForPageToLoad(20);
        return BrowserUtils.getTextFromWebElements(accountTypes);
    }

    public List<String> getCreditAccColumns(){
        BrowserUtils.waitForPageToLoad(20);
        return BrowserUtils.getTextFromWebElements(creditAccColumns);
    }
}
