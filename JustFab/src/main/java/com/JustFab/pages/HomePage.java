package com.JustFab.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class HomePage extends TestBase {

    @FindBy(xpath = "//a[@class=' login_modal_trigger']")
    private WebElement signInButton;

    @FindBy(xpath = "//input[@placeholder='Search...'][1]")
    private WebElement searchBar;

    @FindBy(xpath = "//a[@data-ga-label='newarrivals-main']")
    private WebElement newArrivalsButton;

    @FindBy(xpath = "//a[@data-ga-label='bootshop-main']")
    private WebElement bootShop;

    @FindBy(xpath = "//img[@src='//jf-na-cdn.justfab.com/image/site/en_US/brand/ftv/5075/blackbanner.jpg']")
    private WebElement freeReturnsAndExchangesButton;

    @FindBy(xpath = "//*[@id='dsp_body']/div/div[2]/div/div/div[2]/a/img")
    private WebElement takeStyleQuizButton;

    @FindBy(xpath = "//a[@data-ga-label='handbags-accessories-main']")
    private WebElement accessories;

    @FindBy(xpath ="(//a[@rel='external'])[8]")
    private WebElement sneakershop;

    @FindBy(xpath = "//label[@for='remember_me']")
    private WebElement sneakers;

    @FindBy(xpath = "//a[@data-ga-label='All Bags & Accessories']")
    private WebElement allbags;

    @FindBy(xpath = "//div[@class='title']")
    private WebElement memberlogin;

    @FindBy(xpath = "//*[@id='search-input']/input")
    private WebElement element;

    @FindBy(xpath = "//a[@data-ga-label='bootshop-booties']")
    private WebElement booties;

    @FindBy(xpath = "//a[@data-ga-label='newarrivals-clothing']")
    private WebElement clothing;

    @FindBy(xpath = "//a[@class='skipquiz-link']")
    private WebElement skipquiz;

    @FindBy(xpath = "//*[@id='question_text_1764']")
    private WebElement stylequiz;

    public void clickSneakerShop(){
        sneakershop.click();
        Assert.assertTrue(sneakers.isDisplayed());
    }
    public void clickAccessoriesButton(){
        accessories.click();
        Assert.assertTrue(allbags.isDisplayed());
    }
    public void clickOnSignInButton() {
        signInButton.click();
        sleepFor(5);
        Assert.assertTrue(memberlogin.isDisplayed());
    }
    public void typeInSearchBar() {
        searchBar.sendKeys("booties");
        Assert.assertTrue(element.isDisplayed());
    }
    public void mouseHoverNewArrivals(){
        Actions actions = new Actions(driver);
        actions.moveToElement(newArrivalsButton).build().perform();
        Assert.assertTrue(clothing.isDisplayed());
    }
    public void mouseHoverBootShop(){
        Actions actions = new Actions(driver);
        actions.moveToElement(bootShop).build().perform();
        Assert.assertTrue(booties.isDisplayed());
    }
    public void clickOnFreeReturnsAndExchangesButton(){
        freeReturnsAndExchangesButton.click();
        Assert.assertTrue(skipquiz.isDisplayed());
    }
    public void clickOnTakeStyleQuiz(){
        takeStyleQuizButton.click();
        Assert.assertTrue(stylequiz.isDisplayed());
    }
}
