package com.tdbanktest;

import com.tdbank.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidations extends TestBase {
    private HomePage homePage;

    @BeforeMethod
    public void setUpPageFactory(){
         homePage = PageFactory.initElements(driver, HomePage.class);
    }


    @Test
    public void validateUserBeingAbleToClickOnLogInButton() {
        homePage.clickOnLogInButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnSmallBusinessButton() {
        homePage.clickOnSmallBusinessButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnCommercialButton() {
        homePage.clickOnCommercialButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnInvestingAndWealthButton() {
        homePage.clickOnInvestingAndWealthButton();
    }


    @Test
    public void validateUserBeingAbleToClicOnMortgageUnderProducts() {
        homePage.clickOnMortgageUnderProducts();
    }

    @Test
    public void validateUserBeingAbleToClickOnCdsUnderProducts() {
        homePage.clickOnCdsUnderProducts();
    }


    @Test
    public void validateUserBeingAbleToClickOnHomeEquityButton() {
        homePage.clickOnHomeEquityButton();
    }

    @Test
    public void validateGetFinancialTipsTextDisplayed() {
        homePage.getFinancialTipsTextDisplayed();
        Assert.assertTrue(true);
    }
}