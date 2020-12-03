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

    public void clickBraceletCheckBox(){
        braceletCheckBox.click();
        WebElement bracelet = driver.findElement(By.xpath("//label[@for='checkbox-option-selector_1312']"));
        Assert.assertTrue(bracelet.isDisplayed());
    }

    public void clickJewelryStyleButton(){
        jewelryStyleButton.click();
        WebElement body =driver.findElement(By.xpath("//span[@class='option-label'][1]"));
        Assert.assertTrue(body.isDisplayed());
    }
}
