package com.JustFabTest;

import com.JustFab.pages.HomePage;
import com.JustFab.pages.LoginPage;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
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
    @Test(enabled = false)
    public void validateUserCanTypeInEmail(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(5);
        loginPage.typeInEmail();
    }
    @Test(enabled = false)
    public void validateUserCanTypeInPassword() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(5);
        loginPage.typeInPassword();
    }
    @Test
    public void validateUserCanClickOnKeepMeLoggedIn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(3);
        loginPage.clickOnKeepMeLoggedIn();

    }
   /* @Test(enabled = false)
    public void validateUserCanClickIAmNotARobot();
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        loginPage.clickIAmNotARobot();
    }
    @Test(enabled = false)
    public void validateUserCanClickLogInButton(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        sleepFor(30);
        loginPage.typeInEmail();
        loginPage.typeInPassword();
        loginPage.clickLogIn();
    }*/
    @Test(enabled = false)//fix later
    public void validateUserCanClickFacebookLogIn(){
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnSignInButton();
        loginPage.clickFacebookLogIn();
        sleepFor(5);

    }

}