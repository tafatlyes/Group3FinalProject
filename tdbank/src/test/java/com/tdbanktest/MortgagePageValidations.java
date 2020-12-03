package com.tdbanktest;

import com.tdbank.pages.HomePage;
import com.tdbank.pages.MortgagePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class MortgagePageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToClickOnCalculateMyRateButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        MortgagePage mortgagePage = PageFactory.initElements(driver, MortgagePage.class);
        homePage.clickOnMortgageUnderProducts();
        mortgagePage.clickOnCalculateMyRateButton();
    }

    @Test
    public void validateUserBeingAbleToSelectRefinanceUnderPurposeOfLoanButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        MortgagePage mortgagePage = PageFactory.initElements(driver, MortgagePage.class);
        homePage.clickOnMortgageUnderProducts();
        mortgagePage.clickOnCalculateMyRateButton();
        mortgagePage.selectRefinanceUnderPurposeOfLoanButton();
    }

    @Test
    public void validateUserBeingAbleTotypeOnCurrentMortgageBalanceTab() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        MortgagePage mortgagePage = PageFactory.initElements(driver, MortgagePage.class);
        homePage.clickOnMortgageUnderProducts();
        mortgagePage.clickOnCalculateMyRateButton();
        mortgagePage.typeOnCurrentMortgageBalanceTab();
    }
}
