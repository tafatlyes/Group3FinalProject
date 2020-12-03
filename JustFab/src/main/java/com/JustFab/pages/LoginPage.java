package com.JustFab.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;


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

    public void clickOnSignInButton() {
        signInButton.click();
        WebElement element = driver.findElement(By.xpath("//a[@class=' login_modal_trigger']"));
        Assert.assertTrue(element.isDisplayed());

    }

    public void typeInEmail() {
        email.sendKeys("ludaschick87@hotmail.com");
        WebElement emails = driver.findElement(By.xpath("//input[@id='reference_data']"));
        Assert.assertTrue(emails.isDisplayed());
    }

    public void typeInPassword() {
        password.sendKeys("1kidclavil");
        WebElement passwords = driver.findElement(By.xpath("//input[@type='password'][1]"));
        Assert.assertTrue(passwords.isDisplayed());
    }

    public void clickOnKeepMeLoggedIn() {
        keepMeLoggedIn.click();
        WebElement checkbox = driver.findElement(By.xpath("//label[@for='remember_me']"));
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

    public void clickFacebookLogIn(){
        facebookLogIn.click();
        //WebElement fblogin = driver.findElement(By.xpath("//input[@name='login']"));
        //sleepFor(3);
        //Assert.assertTrue(fblogin.isDisplayed());

    }

}