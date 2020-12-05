package com.JustFab.pages;

import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class SignUpPage extends TestBase {

    @FindBy(xpath = "//input[@name='firstname']")
    private WebElement firstName;

    @FindBy(xpath = "//a[@class='skipquiz-link']")
    private WebElement skipquiz;

    @FindBy(xpath = "//input[@id='form_input_email']")
    private WebElement email;

    @FindBy(xpath = "(//img[@width='205'])[1]")
    private WebElement shoeOne;

    @FindBy(xpath = "(//img[@width='205'])[8]")
    private WebElement shoeTwo;

    @FindBy(xpath = "(//img[@width='145'])[4]")
    private WebElement shoeThree;

    @FindBy(xpath = "(//img[@width='145'])[10]")
    private WebElement outfitOne;

    @FindBy(xpath = "(//img[@width='145'])[15]")
    private WebElement outfitTwo;

    @FindBy(xpath = "//input[@type='password']")
    private WebElement password;

    @FindBy(xpath = "//label[@class='label_radio_select_button label_select_button buttongrey shoeSize'][6]")
    private WebElement size8;

    @FindBy(xpath = "//label[@class='label_radio_select_button label_select_button shoeSize buttonpink']")
    private WebElement size8clicked;

    @FindBy(xpath = "//input[@id='form_input_postcode']")
    private WebElement postcode;

    @FindBy(xpath = "//button[@id='continue_registration']")
    private WebElement complete;

    @FindBy(xpath = "//span[@class='welcome-text']")
    private WebElement welcomeText;

    public void clickComplete() {
        complete.click();
        Assert.assertTrue(welcomeText.isDisplayed());
    }

    public void typeInPostCode() {
        postcode.sendKeys("11727");
    }

    public void clickShoeSize() {
        size8.click();
        sleepFor(5);
        Assert.assertTrue(size8clicked.isDisplayed());
    }

    public void typePassword() {
        password.sendKeys("SashaDoll");
    }

    public void clickOutfitTwo() {
        outfitTwo.click();
    }

    public void clickOutfitOne() {
        outfitOne.click();
        sleepFor(5);
        Assert.assertTrue(outfitTwo.isDisplayed());
    }

    public void clickShoeThree() {
        shoeThree.click();
        sleepFor(5);
        Assert.assertTrue(outfitOne.isDisplayed());
    }

    public void clickShoeTwo() {
        shoeTwo.click();
        sleepFor(5);
        Assert.assertTrue(shoeThree.isDisplayed());
    }

    public void clickShoeOne() {
        shoeOne.click();
        sleepFor(5);
        Assert.assertTrue(shoeTwo.isDisplayed());
    }

    public void typeInEmail() {
        email.sendKeys("sasha@sleepC.com");
    }

    public void clickSkipQuiz() {
        skipquiz.click();
        Assert.assertTrue(firstName.isDisplayed());
    }

    public void typeInFirstName() {
        firstName.sendKeys("Sasha");

    }
}
