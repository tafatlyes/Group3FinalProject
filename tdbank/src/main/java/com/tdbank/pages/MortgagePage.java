package com.tdbank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class MortgagePage extends TestBase {

    @FindBy(xpath = "//select[@class='ng-pristine ng-valid ng-touched']")
    WebElement purposeOfLoanButton;
    @FindBy(xpath = "//span[@id='get-quote']")
    private WebElement calculateMyRateButton;
    @FindBy(xpath = "//iframe[@id='iframe13']")
    private WebElement iFrameFindALoan;

    @FindBy(xpath = " //input[@aria-label='Current Property Value ']")
    private WebElement currentPropertyValueTab;

    @FindBy(xpath = "//input[@class='sb-value-present sb-currency-field ng-untouched ng-pristine ng-invalid']")
    private WebElement currentMortgageBalance;


    public void clickOnCalculateMyRateButton() {
        calculateMyRateButton.click();
        sleepFor(5);
        System.out.println("Calculate My Rate Button clicked!!!!!!!!!!!!!");
        Assert.assertTrue(iFrameFindALoan.isDisplayed());
    }


    public void selectRefinanceUnderPurposeOfLoanButton() {  //need to be fixed!!!
        //using iFrame
        driver.switchTo().frame("google-disable-x-frame-options");
        ExtentTestManager.log("IFRAME IS SWITCHED !!!!!!!!!!!!!!");
        //CREATE AN EXPLICIT WAIT TIME
//        WebDriverWait w = new WebDriverWait(driver,20);
//        w.until(ExpectedConditions.elementToBeSelected(By.xpath("//select[@class='ng-pristine ng-valid ng-touched']")));


        Select select = new Select(purposeOfLoanButton);
        select.selectByValue("refi");
        ExtentTestManager.log("Refinance is selected !!!");
        Assert.assertTrue(currentPropertyValueTab.isDisplayed());
    }


    public void typeOnCurrentMortgageBalanceTab() {
        currentMortgageBalance.sendKeys("60000");
        //don't know how to do assertion for this
    }

}



