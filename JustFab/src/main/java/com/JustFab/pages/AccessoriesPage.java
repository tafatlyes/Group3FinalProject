package com.JustFab.pages;

import org.junit.Assert;
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

    @FindBy(xpath = "//li[@class='filter-set-heading'][1]")
    private WebElement bagsStyle;

    @FindBy(xpath = "//div[@id='latest']")
    private WebElement newArrivals;

    @FindBy(xpath = "//img[@style='opacity: 1;'][1]")
    private WebElement aryTote;

    @FindBy(xpath = "//li[@class='filter-set-heading'][1]")
    private WebElement jewelryStyle;

    public void clickJewelryButton() {
        jewelryButton.click();
        Assert.assertTrue(jewelryStyle.isDisplayed());
    }

    public void clickTopRatedButton() {
        topRatedButton.click();
        Assert.assertTrue(aryTote.isDisplayed());
    }

    public void clickBestSellersButton() {
        bestSellersButton.click();
        Assert.assertTrue(newArrivals.isDisplayed());
    }


    public void clickBagsButton() {
        bagsButton.click();
        Assert.assertTrue(bagsStyle.isDisplayed());
    }
}