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

    public void clickAccessoriesButton(){
        accessories.click();
        WebElement allbags = driver.findElement(By.xpath("//a[@data-ga-label='All Bags & Accessories']"));
        Assert.assertTrue(allbags.isDisplayed());
    }
    public void clickOnSignInButton() {
        signInButton.click();
        sleepFor(5);
        WebElement memberlogin = driver.findElement(By.xpath("//div[@class='title']"));
        Assert.assertTrue(memberlogin.isDisplayed());
    }
    public void typeInSearchBar() {
        searchBar.sendKeys("booties");
        WebElement element = driver.findElement(By.xpath("//*[@id=\"search-input\"]/input"));
        Assert.assertTrue(element.isDisplayed());
    }
    public void mouseHoverNewArrivals(){
        Actions actions = new Actions(driver);
        actions.moveToElement(newArrivalsButton).build().perform();
        WebElement element = driver.findElement(By.xpath("//*[@id=\"logged-in-header-nav\"]/ul/li[1]/ul/div[1]/li[1]/ul/div/li[2]/a"));
        Assert.assertTrue(element.isDisplayed());
    }
    public void mouseHoverBootShop(){
        Actions actions = new Actions(driver);
        actions.moveToElement(bootShop).build().perform();
        WebElement booties = driver.findElement(By.xpath("//*[@id=\"logged-in-header-nav\"]/ul/li[3]/ul/div[1]/li[1]/ul/div/li[1]/a"));
        Assert.assertTrue(booties.isDisplayed());
    }
    public void clickOnFreeReturnsAndExchangesButton(){
        freeReturnsAndExchangesButton.click();
        WebElement element = driver.findElement(By.xpath("//a[@class='skipquiz-link']"));
        Assert.assertTrue(element.isDisplayed());
    }
    public void clickOnTakeStyleQuiz(){
        takeStyleQuizButton.click();
        WebElement stylequiz = driver.findElement(By.xpath("//*[@id=\"question_text_1764\"]"));
        Assert.assertTrue(stylequiz.isDisplayed());
    }
}
