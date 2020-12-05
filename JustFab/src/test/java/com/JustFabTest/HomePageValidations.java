package com.JustFabTest;

import com.JustFab.pages.HomePage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToClickSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(5);
    }

    @Test
    public void validateUserBeingAbleToTypeInSearchBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.typeInSearchBar();
    }

    @Test
    public void validateUserCanMouseHoverNewArrivals() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.mouseHoverNewArrivals();
    }

    @Test
    public void validateUserCanMouseHoverBootShop() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.mouseHoverBootShop();
    }

    @Test
    public void validateUserCanClickOnFreeReturnsAndExchangesButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnFreeReturnsAndExchangesButton();
    }

    @Test
    public void validateUserCanClickOnTakeStyleQuiz() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnTakeStyleQuiz();
    }

    @Test
    public void validateUserCanClickAccessoriesButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickAccessoriesButton();
    }

    @Test
    public void validateUserCanClickSneakerShop() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickSneakerShop();

    }
}

