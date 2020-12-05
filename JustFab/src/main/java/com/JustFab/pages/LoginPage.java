package com.JustFab.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

import java.util.Iterator;
import java.util.Set;


public class LoginPage extends TestBase {

    @FindBy(xpath = "//a[@class=' login_modal_trigger']")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@id='reference_data']")
    private WebElement email;

    @FindBy(xpath = "//input[@type='password'][1]")
    private WebElement password;

    @FindBy(xpath = "//label[@for='remember_me']")
    private WebElement keepMeLoggedIn;

    @FindBy(xpath = "//div[@class='recaptcha-checkbox-border'][1]")
    private WebElement iAmNotARobot;

    @FindBy(xpath = "//div[@data-ga-action='connect'][1]")
    private WebElement logIn;

    @FindBy(xpath = "//div[@id='fb_link_login']")
    private WebElement facebookLogIn;

    @FindBy(xpath = "//input[@id='reference_data']")
    private WebElement emails;

    @FindBy(xpath = "//a[@class=' login_modal_trigger']")
    private WebElement element;

    @FindBy(xpath = "//input[@id='email']")
    private WebElement emailTab;

    @FindBy(xpath = "//input[@type='password'][1]")
    private WebElement passwords;

    @FindBy(xpath = "//label[@for='remember_me']")
    private WebElement checkbox;

    @FindBy(xpath = "//a[@class='pink']")
    private WebElement signUp;

    @FindBy(xpath = "//a[@class='skipquiz-link']")
    private WebElement skipquiz;

    public void clickSignUpButton() {
        signUp.click();
        Assert.assertTrue(skipquiz.isDisplayed());
    }

    public void clickOnSignInButton() {
        signInButton.click();
        Assert.assertTrue(element.isDisplayed());

    }

    public void typeInEmail() {
        email.sendKeys("ludaschick87@hotmail.com");
        Assert.assertTrue(emails.isDisplayed());
    }

    public void typeInPassword() {
        password.sendKeys("1kidclavil");
        Assert.assertTrue(passwords.isDisplayed());
    }

    public void clickOnKeepMeLoggedIn() {
        keepMeLoggedIn.click();
        Assert.assertTrue(checkbox.isDisplayed());
    }

    /*public void clickLogIn() {
        logIn.click();
        WebElement login = driver.findElement(By.xpath("//div[@data-ga-action='connect'][1]"));
        Assert.assertTrue(login.isDisplayed());//expected xpath = (//*[@id="error"])[1]
    }
    public void clickIAmNotARobot(){
    iAmNotARobot.click();
    WebElement checkedbox = driver.findElement(By.xpath("//div[@class='recaptcha-checkbox-border'][1]"));
    Assert.assertTrue(checkedbox.isDisplayed());
    }*/

    public void clickFacebookLogIn() {
        facebookLogIn.click();
        Set<String> handler = driver.getWindowHandles();
        Iterator<String> it = handler.iterator();
        String parentWindow = it.next();
        String childWindow = it.next();
        driver.switchTo().window(childWindow);
        sleepFor(2);
        sleepFor(3);
        Assert.assertTrue(emailTab.isDisplayed());

    }

}