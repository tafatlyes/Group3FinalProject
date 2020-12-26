package com.tdbanktest;

import com.tdbank.pages.CDsPage;
import com.tdbank.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class CDsPageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToSelectAState() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CDsPage cDsPage = PageFactory.initElements(driver, CDsPage.class);
        homePage.clickOnCdsUnderProducts();
        cDsPage.selectNewYorkState();
    }

    @Test
    public void validateUserBeingAbleToSelectACity() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CDsPage cDsPage = PageFactory.initElements(driver, CDsPage.class);
        homePage.clickOnCdsUnderProducts();
        cDsPage.selectNewYorkState();
        cDsPage.selectAlbanyCity();
    }

    @Test
    public void validateUserBeingAbleToClickOnHowWeUseYourInfoButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        CDsPage cDsPage = PageFactory.initElements(driver, CDsPage.class);
        homePage.clickOnCdsUnderProducts();
        cDsPage.clickOnHowWeUseYourInfoButton();
    }
}
