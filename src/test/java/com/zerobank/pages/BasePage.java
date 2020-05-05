package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public abstract class BasePage {

    protected WebDriver driver = Driver.getDriver();
    protected WebDriverWait wait = new WebDriverWait(driver,15);


    public BasePage(){
        PageFactory.initElements(driver,this);
    }

    public String getPageTitle(){
        BrowserUtils.waitForPageToLoad(20);
        return driver.getTitle();
    }

    /**
     * Method for Zero Bank navigation. Provide tabName  navigate
     * @param tabName, like Account Summary, Account Activity, Transfer Funds, Pay Bills, My Money Map, Online Statements
     */
    public void navigateTo(String tabName){
        String tabNameXpath = "//ul/li/a[text()='" + tabName + "']";
        WebElement tab = driver.findElement(By.xpath(tabNameXpath));
        wait.until(ExpectedConditions.elementToBeClickable(tab)).click();
    }


}
