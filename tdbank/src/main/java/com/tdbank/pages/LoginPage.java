package com.tdbank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.testng.Assert;
import pnt.automation.base.TestBase;

public class LoginPage extends TestBase {

    @FindBy(xpath = "//input[@id='formElement_0']")
    private WebElement userName;

    @FindBy(xpath = "//*[@id='formElement_1']")
    private WebElement password;

    @FindBy(xpath = "//*[@id='top']/div/ul[1]/li[2]/a/span")
    private WebElement products;

    @FindBy(xpath = "//span[text()='Forgot user name and/or password?']")
    private WebElement forgetUserNameOrPassword;

    @FindBy(xpath = "//span[text()='Sign up for Online Banking']")
    private WebElement signUpForOnlineBanking;


    @FindBy(xpath = "//span[@id='contactUs-id']")
    private WebElement contactUsButton;

    @FindBy(xpath = "  //div[text()='Contact Us']")
    private WebElement contactUs2Button;


    public void typeOnUserNameBar() {
        userName.sendKeys("Custumer1");
        Assert.assertTrue(userName.isDisplayed());
    }


    public void typeOnPasswordBar() {
        password.sendKeys("123456");
        Assert.assertTrue(password.isDisplayed());
    }


    public void clickOnProductsButton() {
        products.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://onlinebanking.tdbank.com/#/settings/productServices");
    }


    public void clickOnForgetUserNameOrPassword() {
        forgetUserNameOrPassword.click();
        Assert.assertEquals(driver.getTitle(), "Log In Help");
    }


    public void clickOnSignUpForOnlineBanking() {
        signUpForOnlineBanking.click();
        Assert.assertEquals(driver.getCurrentUrl(), "https://onlinebanking.tdbank.com/#/authentication/login/enrollment/signup/selectprofile");
    }


    public void clickOnContactUsButton() {
        contactUsButton.click();
        Assert.assertTrue(contactUs2Button.isDisplayed());
    }


}
