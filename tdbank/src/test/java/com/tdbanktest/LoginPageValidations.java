package com.tdbanktest;

import com.tdbank.pages.HomePage;
import com.tdbank.pages.LoginPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;


public class LoginPageValidations extends TestBase {


    @Test
    public void validateUserBeingAbleToTypeOnUserNameBar() {
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        homePage.clickOnLogInButton();
        loginPage.typeOnUserNameBar();
    }

    @Test
    public void validateUserBeingAbleToTypeOnPasswordBar() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnLogInButton();
        loginPage.typeOnPasswordBar();
    }

    @Test
    public void validateUserBeingAbleToClickOnProductsButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnLogInButton();
        loginPage.clickOnProductsButton();
    }

    @Test
    public void validateUserBeingAbleToClickOnForgetUserNameOrPasswordButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnLogInButton();
        loginPage.clickOnForgetUserNameOrPassword();
    }

    @Test
    public void validateUserBeingAbleToClickOnSignUpForOnlineBanking() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnLogInButton();
        loginPage.clickOnSignUpForOnlineBanking();
    }


    @Test
    public void validateUserBeingAbleToClickOnContactUsButton() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        homePage.clickOnLogInButton();
        loginPage.clickOnContactUsButton();
    }

}