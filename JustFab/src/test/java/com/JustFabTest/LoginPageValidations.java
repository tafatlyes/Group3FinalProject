package com.JustFabTest;

import com.JustFab.pages.HomePage;
import com.JustFab.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class LoginPageValidations extends TestBase {

    @Test
    public void validateUserBeingAbleToClickSignInButton() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(5);
    }

    @Test
    public void validateUserCanTypeInEmail() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(5);
        loginPage.typeInEmail();
    }

    @Test
    public void validateUserCanTypeInPassword() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(5);
        loginPage.typeInPassword();
    }

    @Test
    public void validateUserCanClickOnKeepMeLoggedIn() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(3);
        loginPage.clickOnKeepMeLoggedIn();
    }

    @Test
    public void validateUserCanClickSignUpButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickSignUpButton();
    }

    @Test
    public void validateUserCanClickFacebookLogIn() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        loginPage.clickFacebookLogIn();
        sleepFor(5);

    }
   /* @Test(enabled = false)
    public void validateUserCanClickIAmNotARobot();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        loginPage.clickIAmNotARobot();
    }
    @Test
    public void validateUserCanClickLogInButton(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(50);
        loginPage.typeInEmail();
        loginPage.typeInPassword();
        loginPage.clickLogIn();
    }*/


}