package com.wayfairTest;

import com.wayfair.HomePageFooter;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageFooterValidation extends TestBase {
    @Test
    public void validateUserBeingAbleToClickOnAboutWayfairONFooter() {
        HomePageFooter homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);
        homePageFooter.clickOnAboutWayfair();

    }

    @Test
    public void validateUserBeingAbleToClickOnWayfairProfessionalONFooter() {
        HomePageFooter homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);
        homePageFooter.wayfairProfessional();

    }

    @Test
    public void validateUserBeingAbleToClickOnWayfairGiftCardONFooter() {
        HomePageFooter homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);
        homePageFooter.clickOnFooterGiftCard();

    }

    @Test
    public void validateUserBeingAbleToClickOnWayfairCreditCardONFooter() {
        HomePageFooter homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);
        homePageFooter.clickOnWayfairCreditCard();

    }

    @Test
    public void validateUserBeingAbleToClickOnCareerONFooter() {
        HomePageFooter homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);
        homePageFooter.clickOnFooterCareers();

    }

    @Test
    public void validateUserBeingAbleToClickOnSellOnWayfairONFooter() {
        HomePageFooter homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);
        homePageFooter.clickOnFooterSellOnWayfair();

    }

    @Test
    public void validateUserBeingAbleToClickOnInvestorRelationONFooter() {
        HomePageFooter homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);
        homePageFooter.clickOnInvestorRelation();

    }

    @Test
    public void validateUserBeingAbleToClickOnAdvertiseWithUsONFooter() {
        HomePageFooter homePageFooter = PageFactory.initElements(driver, HomePageFooter.class);
        homePageFooter.clickOnAdvertiseWithUs();
    }
}