package com.tdbank.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import pnt.automation.base.TestBase;
import pnt.automation.extent.ExtentTestManager;

public class CDsPage extends TestBase {


    @FindBy(xpath = "//select[@id='state']")
    private WebElement selectAStateTab;

    @FindBy(xpath = "//select[@id='city']")
    private WebElement selectACityTab;

    @FindBy(xpath = "//a[@class='td-link td-link-standalone']")
    private WebElement howWeUseYourInfoButton;


    public void selectNewYorkState() {
        sleepFor(3);
        Select select = new Select(selectAStateTab);
        select.selectByVisibleText("New York");
        ExtentTestManager.log("New York State is selected !!!");
        Assert.assertTrue(selectACityTab.isDisplayed());
    }

    public void selectAlbanyCity() {
        sleepFor(3);
        Select select = new Select(selectAStateTab);
        select.selectByVisibleText("New York");
        ExtentTestManager.log("New York State is selected !!!");
        Assert.assertTrue(selectACityTab.isDisplayed());
        Select select1 = new Select(selectACityTab);
        select1.selectByVisibleText("Albany");
    }


    public void clickOnHowWeUseYourInfoButton() {
        sleepFor(3);
        howWeUseYourInfoButton.click();
        Assert.assertEquals(driver.getTitle(), "TD Bank Privacy & Personal Information Policy");
        ExtentTestManager.log(driver.getTitle());

    }


}
