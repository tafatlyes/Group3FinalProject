package com.JustFabTest;

import com.JustFab.pages.HomePage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class HomePageValidations extends TestBase {

    @Test(enabled = false)
    public void validateUserBeingAbleToClickSignInButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(5);
    }
        @Test(enabled = false)
        public void validateUserBeingAbleToTypeInSearchBar () {
            HomePage homePage = PageFactory.initElements(driver, HomePage.class);
            homePage.typeInSearchBar();
     }
@Test(enabled = false)
public void validateUserCanMouseHoverNewArrivals(){
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    homePage.mouseHoverNewArrivals();
}
@Test(enabled = false)
    public void validateUserCanMouseHoverBootShop(){
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    homePage.mouseHoverBootShop();
}
@Test(enabled = false)
    public void validateUserCanClickOnFreeReturnsAndExchangesButton() {
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnFreeReturnsAndExchangesButton();
}
@Test(enabled = false)
    public void validateUserCanClickOnTakeStyleQuiz(){
    HomePage homePage = PageFactory.initElements(driver, HomePage.class);
    homePage.clickOnTakeStyleQuiz();
}
@Test(enabled = false)
    public void validateUserCanClickAccessoriesButton(){
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickAccessoriesButton();
}
    }

