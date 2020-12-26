package com.tdbanktest;

import com.tdbank.pages.HomePage;
import com.tdbank.pages.InvestingAndWealthPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class InvestingAndWealthPageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToClickOnIndividualsAndFamiliesButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        InvestingAndWealthPage investingAndWealthPage = PageFactory.initElements(driver, InvestingAndWealthPage.class);
        homePage.clickOnInvestingAndWealthButton();
        investingAndWealthPage.clickOnIndividualsAndFamiliesButton();
    }

    @Test
    public void validateExploreInvestingTextIsDisplayed() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        InvestingAndWealthPage investingAndWealthPage = PageFactory.initElements(driver, InvestingAndWealthPage.class);
        homePage.clickOnInvestingAndWealthButton();
        investingAndWealthPage.exploreInvestingTextIsDisplayed();
    }

    @Test
    public void validateImg1IsDisplayed() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        InvestingAndWealthPage investingAndWealthPage = PageFactory.initElements(driver, InvestingAndWealthPage.class);
        homePage.clickOnInvestingAndWealthButton();
        investingAndWealthPage.img1IsDisplayed();
    }

    @Test
    public void validatePrivateBankingImageIsDisplayed() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        InvestingAndWealthPage investingAndWealthPage = PageFactory.initElements(driver, InvestingAndWealthPage.class);
        homePage.clickOnInvestingAndWealthButton();
        investingAndWealthPage.privateBankingImageIsDisplayed();
    }

    @Test
    public void validateUserBeingAbleToClickOnBusinessOwnersButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        InvestingAndWealthPage investingAndWealthPage = PageFactory.initElements(driver, InvestingAndWealthPage.class);
        homePage.clickOnInvestingAndWealthButton();
        investingAndWealthPage.clickOnBusinessOwnersButton();
    }

}
