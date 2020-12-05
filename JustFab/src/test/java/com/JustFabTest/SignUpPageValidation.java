package com.JustFabTest;

import com.JustFab.pages.HomePage;
import com.JustFab.pages.LoginPage;
import com.JustFab.pages.SignUpPage;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;
import pnt.automation.base.TestBase;

public class SignUpPageValidation extends TestBase {

    @Test
    public void validateUserCanClickShoeSize() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickSignUpButton();
        signUpPage.clickSkipQuiz();
        signUpPage.clickShoeSize();
    }

    @Test
    public void validateUserCanTypeInFirstName() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickSignUpButton();
        signUpPage.clickSkipQuiz();
        signUpPage.typeInFirstName();

    }

    @Test
    public void validateUserCanTypeInEmail() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickSignUpButton();
        signUpPage.clickSkipQuiz();
        signUpPage.typeInEmail();
    }

    @Test
    public void validateUserCanSignUp() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickSignUpButton();
        signUpPage.clickSkipQuiz();
        signUpPage.typeInFirstName();
        signUpPage.typeInEmail();
        signUpPage.typePassword();
        signUpPage.typeInPostCode();
        signUpPage.clickShoeSize();
        signUpPage.clickComplete();
    }

    @Test
    public void validateUserCanClickShoeOne() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickSignUpButton();
        signUpPage.clickShoeOne();
    }

    @Test
    public void validateUserCanClickOutfitOne() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickSignUpButton();
        signUpPage.clickShoeOne();
        signUpPage.clickShoeTwo();
        signUpPage.clickShoeThree();
        signUpPage.clickOutfitOne();
    }

    @Test
    public void validateUserCanClickShoeThree() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickSignUpButton();
        signUpPage.clickShoeOne();
        signUpPage.clickShoeTwo();
        signUpPage.clickShoeThree();

    }

    @Test
    public void validateUserCanClickShoeTwo() {
        HomePage homePage = PageFactory.initElements(driver, HomePage.class);
        LoginPage loginPage = PageFactory.initElements(driver, LoginPage.class);
        SignUpPage signUpPage = PageFactory.initElements(driver, SignUpPage.class);
        homePage.clickOnSignInButton();
        loginPage.clickSignUpButton();
        signUpPage.clickShoeOne();
        signUpPage.clickShoeTwo();
    }
}
