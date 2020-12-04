package com.tdbank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class MortgagePage extends TestBase {

    @FindBy(xpath = "(//select[@class='ng-pristine ng-valid ng-touched'])[1]")
    WebElement purposeOfLoanButton;

    @FindBy(xpath = "//span[@id='get-quote']")
    private WebElement calculateMyRateButton;

    @FindBy(xpath = "//iframe[@id='iframe13']")
    private WebElement iFrameFindALoan;

    @FindBy(xpath = "//input[@aria-label='Current Property Value']")
    private WebElement currentPropertyValueTab;

    @FindBy(xpath = "//input[@aria-label='Current Mortgage Balance ']")
    private WebElement currentMortgageBalance;

    @FindBy(xpath = "(//select[@class='ng-pristine ng-valid ng-touched'])[1]/option[2]")
    private WebElement refinanceButton;


    public void clickOnCalculateMyRateButton() {
        calculateMyRateButton.click();
        sleepFor(5);
        Assert.assertTrue(iFrameFindALoan.isDisplayed());
        ExtentTestManager.log("iFrame is displayed  !!!");

    }


    public void selectRefinanceUnderPurposeOfLoanButton() {  //need to be fixed!!!
        sleepFor(6);
        //using iFrame
        driver.switchTo().frame("google-disable-x-frame-options");
        ExtentTestManager.log("IFRAME IS SWITCHED !!!!!!!!!!!!!!");

        sleepFor(10);
        purposeOfLoanButton.click();
        ExtentTestManager.log("purpose of loan button is clicked !!!");
        sleepFor(3);
        refinanceButton.click();
        ExtentTestManager.log("Refinance is selected !!!");

//        Select select = new Select(purposeOfLoanButton);
//        select.selectByVisibleText("Refinance ");
//        ExtentTestManager.log("Refinance is selected !!!");
//        sleepFor(3);
//        Assert.assertTrue(currentPropertyValueTab.isDisplayed());
    }


    public void typeOnCurrentMortgageBalanceTab() {
        sleepFor(15);
        //using iFrame
        driver.switchTo().frame("google-disable-x-frame-options");
        ExtentTestManager.log("IFRAME IS SWITCHED !!!!!!!!!!!!!!");

        sleepFor(5);
        currentMortgageBalance.sendKeys("600000");
        //don't know how to do assertion for this
    }

}



