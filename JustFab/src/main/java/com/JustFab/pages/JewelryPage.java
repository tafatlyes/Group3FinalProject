package com.JustFab.pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pnt.automation.base.TestBase;

public class JewelryPage extends TestBase {

    @FindBy(xpath = "//li[@class='filter-set-heading'][1]")
    private WebElement jewelryStyleButton;

    @FindBy(xpath = "//label[@for='checkbox-option-selector_1312']")
    private WebElement braceletCheckBox;

    @FindBy(xpath = "//label[@for='checkbox-option-selector_1313']")
    private WebElement earringsCheckBox;

    @FindBy(xpath = "//div[@id='selected_sort']")
    private WebElement priceLowToHighButton;

    @FindBy(xpath = "//span[@class='option-label'][1]")
    private WebElement body;

    @FindBy(xpath = "//div[@value='Bracelets']")
    private WebElement bracelet;

    @FindBy(xpath = "//div[@value='Earrings']")
    private WebElement earrings;

    @FindBy(xpath = "//div[@id='latest']")
    private WebElement lowhigh;

    public void clickPriceLowToHighButton(){
        priceLowToHighButton.click();
        Assert.assertTrue(lowhigh.isDisplayed());
    }
    public void clickEarringsCheckBox(){
        earringsCheckBox.click();
        Assert.assertTrue(earrings.isDisplayed());
    }
    public void clickBraceletCheckBox(){
        braceletCheckBox.click();
        Assert.assertTrue(bracelet.isDisplayed());
    }
    public void clickJewelryStyleButton(){
        jewelryStyleButton.click();
        Assert.assertTrue(body.isDisplayed());
    }
}
