package com.tdbanktest;

import com.tdbank.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidations extends TestBase {


    @Test
    public void validateUserBeingAbleToClickOnLogInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnLogInButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnSmallBusinessButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSmallBusinessButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnCommercialButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCommercialButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnInvestingAndWealthButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnInvestingAndWealthButton();
    }


    @Test
    public void validateUserBeingAbleToClicOnMortgageUnderProducts() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnMortgageUnderProducts();
    }

    @Test
    public void validateUserBeingAbleToClickOnCdsUnderProducts() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnCdsUnderProducts();
    }


    @Test
    public void validateUserBeingAbleToClickOnHomeEquityButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnHomeEquityButton();
    }

    @Test
    public void validateGetFinancialTipsTextDisplayed() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.getFinancialTipsTextDisplayed();
        Assert.assertTrue(true);
    }
}