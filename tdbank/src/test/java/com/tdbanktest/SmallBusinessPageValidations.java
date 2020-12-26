package com.tdbanktest;

import com.tdbank.pages.HomePage;
import com.tdbank.pages.SmallBusinessPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class SmallBusinessPageValidations extends TestBase {


    @Test
    public void validateUserBeingAbleToClickOnCheckingAccount() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SmallBusinessPage smallBusinessPage = PageFactory.initElements(driver, SmallBusinessPage.class);
        homePage.clickOnSmallBusinessButton();
        smallBusinessPage.clickOnCheckingAccount();
    }

    @Test
    public void validateUserBeingAbleToClickOnLoansAndLinesOfCredit() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SmallBusinessPage smallBusinessPage = PageFactory.initElements(driver, SmallBusinessPage.class);
        homePage.clickOnSmallBusinessButton();
        smallBusinessPage.clickOnLoansAndLinesOfCredit();
    }

    @Test
    public void validateUserBeingAbleToClickOnCreditCards() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SmallBusinessPage smallBusinessPage = PageFactory.initElements(driver, SmallBusinessPage.class);
        homePage.clickOnSmallBusinessButton();
        smallBusinessPage.clickOnCreditCards();
    }

    @Test
    public void validateUserBeingAbleToClickOnHealthcareProfessionals() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SmallBusinessPage smallBusinessPage = PageFactory.initElements(driver, SmallBusinessPage.class);
        homePage.clickOnSmallBusinessButton();
        smallBusinessPage.clickOnHealthcareProfessionals();
    }

    @Test
    public void validateUserBeingAbleToClickOnMerchantSolutions() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        SmallBusinessPage smallBusinessPage = PageFactory.initElements(driver, SmallBusinessPage.class);
        homePage.clickOnSmallBusinessButton();
        smallBusinessPage.clickOnMerchantSolutions();
    }
}
