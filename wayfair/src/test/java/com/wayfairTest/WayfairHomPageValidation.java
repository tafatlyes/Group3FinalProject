package com.wayfairTest;

import com.wayfair.WayFairHomPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class WayfairHomPageValidation extends TestBase {

    @Test
    public void validateUserBeingAbleToTypeOnSearchBar() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        wayFairHomPage.typeOnSearchBar();

    }

    @Test
    public void validateUserBeingAbleToClickOnPhotoButtonOnSearchBar() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        wayFairHomPage.clickOnPhotoButton();
    }


    @Test
    public void validateUserBeingAbleToSignInUnderMyAccountAndOrders() {
        WayFairHomPage wayFairHomPage = PageFactory.initElements(driver, WayFairHomPage.class);
        wayFairHomPage.signInAndClick();
    }

    @Test
    public void validateUserBeingAbleToHoverToMyAccountAndOrdersAndClickOnMyOrders() {
        WayFairHomPage homePage = PageFactory.initElements(driver, WayFairHomPage.class);
        homePage.mouseHoverMyAccountAndOrder();
    }

    @Test
    public void validateUserBeingAbleToHoverOnMyAccountAndOrderAndClickOnListAndRegistry() {
        WayFairHomPage homePage = PageFactory.initElements(driver, WayFairHomPage.class);
        homePage.mouseHoverToListAndRegistry();
    }


    @Test
    public void validateUserBeingAbleToClickOnListsUnderListsAndRegistry2() {
        WayFairHomPage homePage = PageFactory.initElements(driver, WayFairHomPage.class);
        homePage.mouseHoverToListAndRegistry2();
    }

    @Test
    public void validateUserBeingAbleToHoverHolidayAndClickOnHanukkah() {
        WayFairHomPage homePage = PageFactory.initElements(driver, WayFairHomPage.class);
        homePage.hoverHolidayButtonAndClick();
    }

    @Test
    public void validateUserBeingAbleToHoverOnPetAndClickDogBeds() {
        WayFairHomPage homePage = PageFactory.initElements(driver, WayFairHomPage.class);
        homePage.mouseHoverOnPetAndClickOnDogBeds();

    }

    @Test
    public void validUserBeingAbleToClickOnFurnitureButton() {
        WayFairHomPage homePage = PageFactory.initElements(driver, WayFairHomPage.class);
        homePage.clickOnFurnitureButton();
    }

    @Test
    public void validUserBeingAbleToClickOnOutDoorButton() {
        WayFairHomPage homePage = PageFactory.initElements(driver, WayFairHomPage.class);
        homePage.clickOnOutdoorButton();
    }

}
