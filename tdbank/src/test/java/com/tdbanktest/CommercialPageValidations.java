package com.tdbanktest;

import com.tdbank.pages.CommercialPage;
import com.tdbank.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class CommercialPageValidations extends TestBase {


    @Test
    public void validateUserBeingAbleToSeeEducateText() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CommercialPage commercialPage = PageFactory.initElements(driver, CommercialPage.class);
        homePage.clickOnCommercialButton();
        commercialPage.educateTextvisible();
    }

    @Test
    public void validateLearnMoreButtonIsdisplayed() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CommercialPage commercialPage = PageFactory.initElements(driver, CommercialPage.class);
        homePage.clickOnCommercialButton();
        commercialPage.learnMoreButtonIsdisplayed();
    }

    @Test
    public void validateUserBeingAbleToClickOnEquipmentFinanceButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CommercialPage commercialPage = PageFactory.initElements(driver, CommercialPage.class);
        homePage.clickOnCommercialButton();
        commercialPage.clickOnEquipmentFinanceButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnInternationalPaymentsButtonUnderIndustries() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CommercialPage commercialPage = PageFactory.initElements(driver, CommercialPage.class);
        homePage.clickOnCommercialButton();
        commercialPage.clickOnInternationalPaymentsButtonUnderIndustries();
    }

    @Test
    public void validateUserBeingAbleToClickOnCommercialLendingButtonUnderLending() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CommercialPage commercialPage = PageFactory.initElements(driver, CommercialPage.class);
        homePage.clickOnCommercialButton();
        commercialPage.clickOnCommercialLendingButtonUnderLending();
    }
}
