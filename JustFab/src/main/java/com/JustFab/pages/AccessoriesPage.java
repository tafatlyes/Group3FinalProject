package com.JustFab.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class AccessoriesPage extends TestBase {

    @FindBy(xpath = "//a[@data-ga-label='Bags']")
    private WebElement bagsButton;

    @FindBy(xpath = "//div[@id='selected_sort']")
    private WebElement bestSellersButton;

    @FindBy(xpath = "//div[@id='avg_review_high']")
    private WebElement topRatedButton;

    @FindBy(xpath = "//a[@data-ga-label='Jewelry']")
    private WebElement jewelryButton;

    public void clickJewelryButton(){
        jewelryButton.click();
        WebElement jewelryStyle = driver.findElement(By.xpath("//li[@class='filter-set-heading'][1]"));
        Assert.assertTrue(jewelryStyle.isDisplayed());
    }

    public void clickTopRatedButton(){
        topRatedButton.click();
        WebElement aryTote = driver.findElement(By.xpath("//img[@style='opacity: 1;'][1]"));
        Assert.assertTrue(aryTote.isDisplayed());
    }

    public void clickBestSellersButton(){
        bestSellersButton.click();
        WebElement newArrivals = driver.findElement(By.xpath("//div[@id='latest']"));
        Assert.assertTrue(newArrivals.isDisplayed());
    }


public void clickBagsButton(){
    bagsButton.click();
    WebElement bagsStyle = driver.findElement(By.xpath("//li[@class='filter-set-heading'][1]"));
    Assert.assertTrue(bagsStyle.isDisplayed());
}
}