package com.tdbank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;

public class CommercialPage extends TestBase {


    @FindBy(xpath = "//p[text()='Educate yourself with tips, insights and terms to help protect your business.']")
    private WebElement educateText;

    @FindBy(xpath = "//a[text()='Learn More']")
    private WebElement learnMoreButton;

    @FindBy(xpath = "(//p[text()='Equipment Finance'])[1]")
    private WebElement equipmentFinanceButton;

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-4']")
    private WebElement industriesButton;

    @FindBy(xpath = "(//a[text()='International Payments'])[1]")
    private WebElement internationalPaymentsButton;

    @FindBy(xpath = "//a[@id='td-desktop-nav-dropdown-link-2']")
    private WebElement lendingButton;

    @FindBy(xpath = "(//a[text()='Commercial Lending'])[1]")
    private WebElement commercialLendingButton;

    @FindBy(xpath = "//p[text()='Educate yourself with tips, insights and terms to help protect your business.']")
    private WebElement educateYourSelfWithTipsText;


    public void educateTextvisible() {
        educateText.getText();
        Assert.assertEquals(educateYourSelfWithTipsText.getText(), "Educate yourself with tips, insights and terms to help protect your business.");
    }

    public void learnMoreButtonIsdisplayed() {
        learnMoreButton.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickOnEquipmentFinanceButton() {
        equipmentFinanceButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/commercial-banking/lending-solutions/equipment-finance/");
    }

    public void clickOnInternationalPaymentsButtonUnderIndustries() {
        Actions actions = new Actions(driver);
        actions.moveToElement(industriesButton).build().perform();
        sleepFor(3);
        internationalPaymentsButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/commercial-banking/industry/international-payments/");
    }

    public void clickOnCommercialLendingButtonUnderLending() {
        Actions actions = new Actions(driver);
        actions.moveToElement(lendingButton).build().perform();
        commercialLendingButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/commercial-banking/lending-solutions/commercial-lending/");
    }
}
