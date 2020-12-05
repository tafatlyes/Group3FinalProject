package com.tdbank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class HomePage extends TestBase {

    @FindBy(xpath = "//*[@id='main']/div[1]/div[2]/section/div/div/div/div[2]/div/div[2]/div[1]/button")
    private WebElement logInButton;

    @FindBy(xpath = "(//a[text()='Small Business'])[1]")
    private WebElement smallBusinessButton;

    @FindBy(xpath = "(//a[text()='Commercial'])[1]")
    private WebElement commercial;

    @FindBy(xpath = "(//a[text()='Investing & Wealth'])[1]")
    private WebElement investingAndWealth;

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-2']")
    private WebElement products;

    @FindBy(xpath = "(//a[text()='Mortgage'])[1]")
    private WebElement mortgage;


    @FindBy(xpath = "(//p[text()='Home Equity'])[1]")
    private WebElement homeEquity;


    @FindBy(xpath = "   (//span[text()='Get financial tips, tools and resources'])[1]")
    private WebElement getFinancialTipsText;

    @FindBy(xpath = "//h1[text()='Welcome to Online Banking']")
    private WebElement webElementWelcomeToOnlineBanking;

    @FindBy(xpath = "(//input[@class='td-search-submit'])[1]")
    private WebElement searchButton;

    @FindBy(xpath = "(//input[@placeholder='Search'])[1]")
    private WebElement searchBar;

    @FindBy(xpath = "(//a[text()='CDs'])[1]")
    private WebElement cdsButton;


    public void clickOnLogInButton() {
        logInButton.click();
        //using Webelement is displayed
        Assert.assertTrue(webElementWelcomeToOnlineBanking.isDisplayed());
        ExtentTestManager.log("Login button clicked !!!");

    }


    public void clickOnSmallBusinessButton() {
        smallBusinessButton.click();
        sleepFor(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/small-business/");
    }


    public void clickOnCommercialButton() {
        commercial.click();
        sleepFor(3);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/commercial-banking/");
    }


    public void clickOnInvestingAndWealthButton() {
        investingAndWealth.click();
        sleepFor(3);
        //using assertEquals(actual, expected);
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/investing/");
    }


    public void clickOnMortgageUnderProducts() {
        Actions actions = new Actions(driver);
        actions.moveToElement(products).build().perform();
        sleepFor(3);
        mortgage.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/personal-banking/mortgage/");
    }

    public void clickOnCdsUnderProducts() {
        Actions actions = new Actions(driver);
        actions.moveToElement(products).build().perform();
        sleepFor(3);
        cdsButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/personal-banking/certificates-of-deposit/");
    }


    public void clickOnHomeEquityButton() {
        homeEquity.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/personal-banking/home-equity/");
    }


    public void getFinancialTipsTextDisplayed() {
        getFinancialTipsText.isDisplayed();
    }
}
