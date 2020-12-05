package com.tdbank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;

public class InvestingAndWealthPage extends TestBase {

    @FindBy(xpath = "(//p[text()='Individuals & Families'])[1]")
    private WebElement individualsAndFamiliesButton;

    @FindBy(xpath = "//h2[text()='Explore investing solutions based on your needs']")
    private WebElement exploreInvestingText;

    @FindBy(xpath = "(//img[@class='td-illustration'])[1]")
    private WebElement img1;

    @FindBy(xpath = "(//img[@class='td-illustration'])[2]")
    private WebElement privateBankingImage;

    @FindBy(xpath = "(//p[text()='Business Owners'])[1]")
    private WebElement businessOwnersButton;


    public void clickOnIndividualsAndFamiliesButton() {
        sleepFor(3);
        individualsAndFamiliesButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/investing/individual-family/");
    }

    public void exploreInvestingTextIsDisplayed() {
        sleepFor(3);
        exploreInvestingText.isDisplayed();
        Assert.assertTrue(true);
    }

    public void img1IsDisplayed() {
        sleepFor(3);
        img1.isDisplayed();
        Assert.assertTrue(true);
    }

    public void privateBankingImageIsDisplayed() {
        sleepFor(3);
        privateBankingImage.isDisplayed();
        Assert.assertTrue(true);
    }

    public void clickOnBusinessOwnersButton() {
        sleepFor(3);
        businessOwnersButton.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://www.td.com/us/en/investing/business-owner/");
    }
}
